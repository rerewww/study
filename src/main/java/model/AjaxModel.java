package model;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by son on 2019-06-09.
 */
@Data
@AllArgsConstructor
public class AjaxModel {
    private boolean success;
    private Object data;
}
