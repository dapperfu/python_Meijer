package com.bugsnag.android;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0001¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0018\u0010\u000f\u001a\u00060\fj\u0002`\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/bugsnag/android/o0;", "", "<init>", "()V", "", "key", "value", "", "a", "(Ljava/lang/String;Ljava/lang/Object;)V", "toString", "()Ljava/lang/String;", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "Ljava/lang/StringBuilder;", "sb", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* renamed from: com.bugsnag.android.o0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C6486o0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final StringBuilder sb = new StringBuilder();

    public final void a(String key, Object value) {
        this.sb.append(key + '=' + value);
        this.sb.append("\n");
    }

    public String toString() {
        String string = this.sb.toString();
        Intrinsics.f(string, "sb.toString()");
        return string;
    }
}
