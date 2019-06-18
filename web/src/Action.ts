/**
 * Created by son on 2019-05-29.
 */
import $ from 'jquery'
import {Renderer} from "./Renderer";

export class Action {
    private renderer = new Renderer();
    public checkArrayObject(): void {
        $.ajax({
            url: '/checkArrayObject',
            type: 'get',
            success() {
                console.log('success');
            },
            error() {
                console.log('error');
            }
        });
    }
    public download(): void {
        $("body").append("<iframe src='/download.cmd' style='display: none;' ></iframe>");
    }

    public upload(): void {
        const form = $('#sendFiles')[0];
        const formData = new FormData(form);
        $.ajax({
            url: '/upload.cmd',
            type: 'post',
            processData: false,
            contentType: false,
            data: formData,
            success(response) {
                console.log(response.data);
            },
            error(response) {
                console.log(response);
            }
        });
    }
}
