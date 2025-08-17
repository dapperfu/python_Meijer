package com.bazaarvoice.bvandroidsdk;

import java.util.List;
import mg.InterfaceC15617c;

/* loaded from: classes4.dex */
public abstract class ConversationsResponse {

    @InterfaceC15617c(alternate = {"errors"}, value = "Errors")
    private List<Error> errors;

    @InterfaceC15617c(alternate = {"hasErrors"}, value = "HasErrors")
    private Boolean hasErrors;

    public List<Error> getErrors() {
        return this.errors;
    }

    public Boolean getHasErrors() {
        return this.hasErrors;
    }
}
