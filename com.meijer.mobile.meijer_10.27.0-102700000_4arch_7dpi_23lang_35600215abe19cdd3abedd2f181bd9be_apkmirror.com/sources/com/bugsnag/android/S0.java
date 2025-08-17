package com.bugsnag.android;

import com.bugsnag.android.C6482m0;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0001\u001cB\u0017\b\u0016\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B-\b\u0016\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0005\u0010\u000fJ#\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u0015\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0014\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001e¨\u0006 "}, d2 = {"Lcom/bugsnag/android/S0;", "Lcom/bugsnag/android/m0$a;", "", "Lcom/bugsnag/android/R0;", "frames", "<init>", "(Ljava/util/List;)V", "", "Ljava/lang/StackTraceElement;", "stacktrace", "", "", "projectPackages", "Lcom/bugsnag/android/t0;", "logger", "([Ljava/lang/StackTraceElement;Ljava/util/Collection;Lcom/bugsnag/android/t0;)V", "c", "([Ljava/lang/StackTraceElement;)[Ljava/lang/StackTraceElement;", "b", "(Ljava/util/List;)Ljava/util/List;", "el", "d", "(Ljava/lang/StackTraceElement;Ljava/util/Collection;Lcom/bugsnag/android/t0;)Lcom/bugsnag/android/R0;", "Lcom/bugsnag/android/m0;", "writer", "", "toStream", "(Lcom/bugsnag/android/m0;)V", "a", "Ljava/util/List;", "()Ljava/util/List;", "trace", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes4.dex */
public final class S0 implements C6482m0.a {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<R0> trace;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/bugsnag/android/S0$a;", "", "<init>", "()V", "", "className", "", "projectPackages", "", "a", "(Ljava/lang/String;Ljava/util/Collection;)Ljava/lang/Boolean;", "", "STACKTRACE_TRIM_LENGTH", "I", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
    /* renamed from: com.bugsnag.android.S0$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Boolean a(String className, Collection<String> projectPackages) {
            Collection<String> collection = projectPackages;
            if (!collection.isEmpty()) {
                Iterator<T> it = collection.iterator();
                while (it.hasNext()) {
                    if (StringsKt.W(className, (String) it.next(), false, 2, null)) {
                        return Boolean.TRUE;
                    }
                }
            }
            return null;
        }
    }

    public S0(List<R0> list) {
        this.trace = b(list);
    }

    private final StackTraceElement[] c(StackTraceElement[] frames) {
        return frames.length >= 200 ? (StackTraceElement[]) ArraysKt.U0(frames, RangesKt.x(0, HttpResponseStatus.SUCCESS_OK)) : frames;
    }

    public S0(StackTraceElement[] stackTraceElementArr, Collection<String> collection, InterfaceC6495t0 interfaceC6495t0) {
        StackTraceElement[] stackTraceElementArrC = c(stackTraceElementArr);
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArrC) {
            R0 r0D = d(stackTraceElement, collection, interfaceC6495t0);
            if (r0D != null) {
                arrayList.add(r0D);
            }
        }
        this.trace = arrayList;
    }

    public final List<R0> a() {
        return this.trace;
    }

    private final List<R0> b(List<R0> frames) {
        if (frames.size() >= 200) {
            return frames.subList(0, HttpResponseStatus.SUCCESS_OK);
        }
        return frames;
    }

    private final R0 d(StackTraceElement el2, Collection<String> projectPackages, InterfaceC6495t0 logger) {
        String methodName;
        try {
            String className = el2.getClassName();
            Intrinsics.f(className, "className");
            if (className.length() > 0) {
                methodName = className + "." + el2.getMethodName();
            } else {
                methodName = el2.getMethodName();
            }
            String str = methodName;
            String fileName = el2.getFileName();
            if (fileName == null) {
                fileName = "Unknown";
            }
            return new R0(str, fileName, Integer.valueOf(el2.getLineNumber()), INSTANCE.a(className, projectPackages), null, null, 48, null);
        } catch (Exception e10) {
            logger.b("Failed to serialize stacktrace", e10);
            return null;
        }
    }

    @Override // com.bugsnag.android.C6482m0.a
    public void toStream(C6482m0 writer) throws IOException {
        writer.c();
        Iterator<T> it = this.trace.iterator();
        while (it.hasNext()) {
            writer.e0((R0) it.next());
        }
        writer.h();
    }
}
