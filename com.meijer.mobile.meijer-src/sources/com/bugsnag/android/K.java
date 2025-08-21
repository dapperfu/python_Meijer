package com.bugsnag.android;

import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\n\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR%\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/bugsnag/android/K;", "", "", "endpoint", "", "headers", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "b", "Ljava/util/Map;", "()Ljava/util/Map;", "bugsnag-android-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class K {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String endpoint;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Map<String, String> headers;

    /* renamed from: a, reason: from getter */
    public final String getEndpoint() {
        return this.endpoint;
    }

    public final Map<String, String> b() {
        return this.headers;
    }

    public K(String str, Map<String, String> map) {
        this.endpoint = str;
        this.headers = map;
    }
}
