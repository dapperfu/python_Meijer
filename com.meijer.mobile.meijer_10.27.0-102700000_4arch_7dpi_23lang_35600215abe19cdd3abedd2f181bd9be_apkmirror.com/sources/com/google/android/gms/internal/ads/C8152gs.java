package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.gs, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8152gs extends C7 {

    /* renamed from: c, reason: collision with root package name */
    static final C8152gs f74413c = new C8152gs();

    @Override // com.google.android.gms.internal.ads.C7
    public final G7 b(String str, byte[] bArr, String str2) {
        return "moov".equals(str) ? new J7() : "mvhd".equals(str) ? new K7() : new L7(str);
    }

    C8152gs() {
    }
}
