package com.bazaarvoice.bvandroidsdk;

/* loaded from: classes4.dex */
public interface FingerprintProvider {
    public static final FingerprintProvider EMPTY = new FingerprintProvider() { // from class: com.bazaarvoice.bvandroidsdk.FingerprintProvider.1
        @Override // com.bazaarvoice.bvandroidsdk.FingerprintProvider
        public String getFingerprint() {
            return "";
        }
    };

    String getFingerprint();
}
