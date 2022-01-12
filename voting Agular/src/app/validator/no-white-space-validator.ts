import { AbstractControl, FormControl, ValidationErrors } from "@angular/forms";

export class NoWhiteSpaceValidator {
    
    static noWhitespaceValidator(control:AbstractControl):ValidationErrors |null {
        // const isWhitespace = (control.value || '').trim().length === 0;
        // const isValid = !isWhitespace;
        // return isValid ? null : { 'whitespace': true };
        if ((control.value as string).indexOf(' ')>=0)
        return {whitespace:true};

        return null;
    }
}
