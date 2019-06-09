/**
 * Created by son on 2019-06-10.
 */
import $ from 'jquery'

export class Renderer {
    public renderById(id: string, msg: any): void {
        $('#id').val(msg);
    }
}