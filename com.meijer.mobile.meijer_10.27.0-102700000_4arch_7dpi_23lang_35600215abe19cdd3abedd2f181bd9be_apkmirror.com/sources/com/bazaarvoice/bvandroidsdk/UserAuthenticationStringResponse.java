package com.bazaarvoice.bvandroidsdk;

import mg.InterfaceC15617c;

/* loaded from: classes4.dex */
public class UserAuthenticationStringResponse extends ConversationsSubmissionResponse {

    @InterfaceC15617c("Authentication")
    private UasContainer uasContainer;

    private static class UasContainer {

        @InterfaceC15617c("User")
        private String uas;

        private UasContainer() {
        }
    }

    public String getUas() {
        UasContainer uasContainer = this.uasContainer;
        if (uasContainer != null) {
            return uasContainer.uas;
        }
        return null;
    }
}
