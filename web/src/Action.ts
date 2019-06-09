/**
 * Created by son on 2019-05-29.
 */
import $ from 'jquery'

export class Action {
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
        const form = $('#sendFiles')[0];
        const formData = new FormData(form);
        $.ajax({
            url: '/fileInfos',
            type: 'post',
            processData: false,
            contentType: false,
            data: formData,
            success(response) {
                console.log(response);
            },
            error(response) {
                console.log(response);
            }
        });
    }
}
