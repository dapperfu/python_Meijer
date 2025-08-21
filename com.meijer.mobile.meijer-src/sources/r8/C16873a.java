package r8;

import z8.f;

/* renamed from: r8.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C16873a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f159431a = f.t("\"dt.send_timestamp\":");

    public static String a(String str, long j10) {
        StringBuilder sb2 = new StringBuilder();
        String str2 = f159431a;
        sb2.append(str2);
        sb2.append("%%SEND_NOW%%");
        return str.replaceAll(sb2.toString(), str2 + j10);
    }
}
