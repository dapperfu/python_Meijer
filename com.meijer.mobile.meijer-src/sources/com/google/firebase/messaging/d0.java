package com.google.firebase.messaging;

import android.text.TextUtils;
import com.fullstory.FS;
import com.google.android.gms.common.internal.C6660q;
import java.util.regex.Pattern;

/* loaded from: classes8.dex */
final class d0 {

    /* renamed from: d, reason: collision with root package name */
    private static final Pattern f89744d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* renamed from: a, reason: collision with root package name */
    private final String f89745a;

    /* renamed from: b, reason: collision with root package name */
    private final String f89746b;

    /* renamed from: c, reason: collision with root package name */
    private final String f89747c;

    private static String d(String str, String str2) {
        if (str != null && str.startsWith("/topics/")) {
            FS.log_w("FirebaseMessaging", String.format("Format /topics/topic-name is deprecated. Only 'topic-name' should be used in %s.", str2));
            str = str.substring(8);
        }
        if (str == null || !f89744d.matcher(str).matches()) {
            throw new IllegalArgumentException(String.format("Invalid topic name: %s does not match the allowed format %s.", str, "[a-zA-Z0-9-_.~%]{1,900}"));
        }
        return str;
    }

    public static d0 f(String str) {
        return new d0("S", str);
    }

    public static d0 g(String str) {
        return new d0("U", str);
    }

    public String b() {
        return this.f89746b;
    }

    public String c() {
        return this.f89745a;
    }

    public String e() {
        return this.f89747c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return this.f89745a.equals(d0Var.f89745a) && this.f89746b.equals(d0Var.f89746b);
    }

    public int hashCode() {
        return C6660q.b(this.f89746b, this.f89745a);
    }

    private d0(String str, String str2) {
        this.f89745a = d(str2, str);
        this.f89746b = str;
        this.f89747c = str + "!" + str2;
    }

    static d0 a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] strArrSplit = str.split("!", -1);
        if (strArrSplit.length != 2) {
            return null;
        }
        return new d0(strArrSplit[0], strArrSplit[1]);
    }
}
