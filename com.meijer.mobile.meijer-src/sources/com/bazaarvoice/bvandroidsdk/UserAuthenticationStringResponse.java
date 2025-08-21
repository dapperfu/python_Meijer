package com.bazaarvoice.bvandroidsdk;

import og.InterfaceC16127c;

/* loaded from: classes4.dex */
public class UserAuthenticationStringResponse extends ConversationsSubmissionResponse {

    @InterfaceC16127c("Authentication")
    private UasContainer uasContainer;

    private static class UasContainer {

        @InterfaceC16127c("User")
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
