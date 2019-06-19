/**
 * Created by son on 2019-05-29.
 */
import $ from 'jquery';
import {Action} from "./Action";

$( document ).ready( () => {
	const action: Action = new Action();
	// action.checkArrayObject();

	$('body').click( (event) => {
		const cmd = $(event.target).attr('cmd');
		if (!action[cmd]) {
			return;
		}
		
		if (cmd.indexOf('new') > -1) {
			
		}
		action[cmd].call(action);
	});
});
