package controller;

import model.AjaxModel;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by son on 2019-05-15.
 */
@Controller
public class MainController {
	@Autowired DownloadView downloadView;

	@RequestMapping("/")
	public String main() {
		return "index";
	}

	@RequestMapping("/checkArrayObject")
	public void checkArrayObject() {
	}

	@ResponseBody
	@RequestMapping(value = "upload.cmd", method = RequestMethod.POST)
	public AjaxModel upload(
			@RequestParam("file") MultipartFile file) throws IOException {
		Map<String, Object> result = new HashMap<>();
		result.put("fileName", file.getOriginalFilename());
		result.put("fileSize", file.getSize());

		File f = new File(String.format("D:\\workspace\\save\\%s", file.getOriginalFilename()));
		FileUtils.copyInputStreamToFile(file.getInputStream(), f);
		return new AjaxModel(true, result);
	}

	@RequestMapping(value = "download.cmd")
	public void download(
			HttpServletResponse response,
			@RequestParam("fileName") String fileName,
			@RequestParam("fileExt") String fileExt) throws IOException {
		String originFileName = String.format("%s.%s", fileName, fileExt);
		File f = new File(String.format("D:\\workspace\\save\\%s", originFileName));
		response.setContentType("application/octet-stream");
		response.setContentLength((int) f.length());

		response.setHeader("Content-Disposition", String.format("attachment; filename=\"%s\";", URLEncoder.encode(originFileName, "utf-8")));
		response.setHeader("Content-Transfer-Encoding", "binary");
		IOUtils.copy(new FileInputStream(f), response.getOutputStream());
	}
}