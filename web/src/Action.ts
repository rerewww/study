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

    public fileInfos(): void {
        const self = this;
        const form = $('#sendFiles')[0];
        const formData = new FormData(form);
        $.ajax({
            url: '/download',
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
