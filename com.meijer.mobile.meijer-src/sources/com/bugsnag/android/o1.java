package com.bugsnag.android;

import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmName;

@Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0002\u0010 \n\u0002\b\u0003\u001a\u0019\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00000\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"", "", "a", "(Ljava/lang/Throwable;)Ljava/util/List;", "bugsnag-android-core_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
@JvmName
/* loaded from: classes4.dex */
public final class o1 {
    public static final List<Throwable> a(Throwable th2) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (th2 != null && linkedHashSet.add(th2)) {
            th2 = th2.getCause();
        }
        return CollectionsKt.j1(linkedHashSet);
    }
}
