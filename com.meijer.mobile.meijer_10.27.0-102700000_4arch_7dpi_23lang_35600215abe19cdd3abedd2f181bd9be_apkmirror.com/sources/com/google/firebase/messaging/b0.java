package com.google.firebase.messaging;

import android.text.TextUtils;
import com.fullstory.FS;
import com.google.android.gms.common.internal.C6535q;
import java.util.regex.Pattern;

/* loaded from: classes7.dex */
final class b0 {

    /* renamed from: d, reason: collision with root package name */
    private static final Pattern f88895d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* renamed from: a, reason: collision with root package name */
    private final String f88896a;

    /* renamed from: b, reason: collision with root package name */
    private final String f88897b;

    /* renamed from: c, reason: collision with root package name */
    private final String f88898c;

    private static String d(String str, String str2) {
        if (str != null && str.startsWith("/topics/")) {
            FS.log_w("FirebaseMessaging", String.format("Format /topics/topic-name is deprecated. Only 'topic-name' should be used in %s.", str2));
            str = str.substring(8);
        }
        if (str == null || !f88895d.matcher(str).matches()) {
            throw new IllegalArgumentException(String.format("Invalid topic name: %s does not match the allowed format %s.", str, "[a-zA-Z0-9-_.~%]{1,900}"));
        }
        return str;
    }

    public String b() {
        return this.f88897b;
    }

    public String c() {
        return this.f88896a;
    }

    public String e() {
        return this.f88898c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return this.f88896a.equals(b0Var.f88896a) && this.f88897b.equals(b0Var.f88897b);
    }

    public int hashCode() {
        return C6535q.b(this.f88897b, this.f88896a);
    }

    private b0(String str, String str2) {
        this.f88896a = d(str2, str);
        this.f88897b = str;
        this.f88898c = str + "!" + str2;
    }

    static b0 a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] strArrSplit = str.split("!", -1);
        if (strArrSplit.length != 2) {
            return null;
        }
        return new b0(strArrSplit[0], strArrSplit[1]);
    }
}
