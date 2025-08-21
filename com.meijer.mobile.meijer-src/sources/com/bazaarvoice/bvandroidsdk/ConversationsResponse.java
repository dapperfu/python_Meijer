package com.bazaarvoice.bvandroidsdk;

import java.util.List;
import og.InterfaceC16127c;

/* loaded from: classes4.dex */
public abstract class ConversationsResponse {

    @InterfaceC16127c(alternate = {"errors"}, value = "Errors")
    private List<Error> errors;

    @InterfaceC16127c(alternate = {"hasErrors"}, value = "HasErrors")
    private Boolean hasErrors;

    public List<Error> getErrors() {
        return this.errors;
    }

    public Boolean getHasErrors() {
        return this.hasErrors;
    }
}
