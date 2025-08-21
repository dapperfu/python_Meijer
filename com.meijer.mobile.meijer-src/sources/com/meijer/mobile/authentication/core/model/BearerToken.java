package com.meijer.mobile.authentication.core.model;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\b\u0001\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\u0007\u001a\u00060\u0002j\u0002`\u0003H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\t\u001a\u00060\u0002j\u0002`\u0003H\u0016¢\u0006\u0004\b\t\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001e\u0010\u0011\u001a\u00020\u00002\f\b\u0003\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\bR\u0015\u0010\u0016\u001a\u00060\u0002j\u0002`\u00038F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\b¨\u0006\u0017"}, d2 = {"Lcom/meijer/mobile/authentication/core/model/BearerToken;", "", "", "Lcom/meijer/mobile/authentication/core/AccessToken;", "accessToken", "<init>", "(Ljava/lang/String;)V", "a", "()Ljava/lang/String;", "toString", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "copy", "(Ljava/lang/String;)Lcom/meijer/mobile/authentication/core/model/BearerToken;", "Ljava/lang/String;", "b", "c", "bearerToken", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final /* data */ class BearerToken {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String accessToken;

    public final BearerToken copy(@g(name = "accessToken") String accessToken) {
        Intrinsics.j(accessToken, "accessToken");
        return new BearerToken(accessToken);
    }

    public BearerToken(@g(name = "accessToken") String accessToken) {
        Intrinsics.j(accessToken, "accessToken");
        this.accessToken = accessToken;
    }

    private final String a() {
        String str = this.accessToken;
        if (!StringsKt.W(str, "Bearer ", false, 2, null)) {
            str = null;
        }
        if (str != null) {
            return str;
        }
        return "Bearer " + this.accessToken;
    }

    /* renamed from: b, reason: from getter */
    public final String getAccessToken() {
        return this.accessToken;
    }

    public boolean equals(Object other) {
        if ((other instanceof BearerToken ? (BearerToken) other : null) != null) {
            return Intrinsics.e(((BearerToken) other).a(), a());
        }
        return false;
    }

    public final String c() {
        return a();
    }

    public int hashCode() {
        return c().hashCode();
    }

    public String toString() {
        return a();
    }
}
