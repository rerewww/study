/**
 * Created by son on 2019-05-29.
 */
import $ from 'jquery'

export class Action {
    public checkArrayObject(): void {
        console.log(123123123);
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
}
