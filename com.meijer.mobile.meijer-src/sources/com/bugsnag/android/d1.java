package com.bugsnag.android;

import com.bugsnag.android.C6624v0;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u0001\u0017B\u0017\b\u0016\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B-\b\u0016\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0005\u0010\u000fJ#\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/bugsnag/android/d1;", "Lcom/bugsnag/android/v0$a;", "", "Lcom/bugsnag/android/c1;", "frames", "<init>", "(Ljava/util/List;)V", "", "Ljava/lang/StackTraceElement;", "stacktrace", "", "", "projectPackages", "Lcom/bugsnag/android/D0;", "logger", "([Ljava/lang/StackTraceElement;Ljava/util/Collection;Lcom/bugsnag/android/D0;)V", "b", "(Ljava/util/List;)Ljava/util/List;", "Lcom/bugsnag/android/v0;", "writer", "", "toStream", "(Lcom/bugsnag/android/v0;)V", "a", "Ljava/util/List;", "()Ljava/util/List;", "trace", "bugsnag-android-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class d1 implements C6624v0.a {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<c1> trace;

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0004\b\t\u0010\nJ-\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/bugsnag/android/d1$a;", "", "<init>", "()V", "", "className", "", "projectPackages", "", "a", "(Ljava/lang/String;Ljava/util/Collection;)Ljava/lang/Boolean;", "Ljava/lang/StackTraceElement;", "el", "Lcom/bugsnag/android/D0;", "logger", "Lcom/bugsnag/android/c1;", "b", "(Ljava/lang/StackTraceElement;Ljava/util/Collection;Lcom/bugsnag/android/D0;)Lcom/bugsnag/android/c1;", "", "STACKTRACE_TRIM_LENGTH", "I", "bugsnag-android-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.bugsnag.android.d1$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Boolean a(String className, Collection<String> projectPackages) {
            Collection<String> collection = projectPackages;
            if (!(collection instanceof Collection) || !collection.isEmpty()) {
                Iterator<T> it = collection.iterator();
                while (it.hasNext()) {
                    if (StringsKt.W(className, (String) it.next(), false, 2, null)) {
                        return Boolean.TRUE;
                    }
                }
            }
            return null;
        }

        public final c1 b(StackTraceElement el2, Collection<String> projectPackages, D0 logger) {
            String methodName;
            try {
                String className = el2.getClassName();
                if (className.length() > 0) {
                    methodName = className + '.' + ((Object) el2.getMethodName());
                } else {
                    methodName = el2.getMethodName();
                }
                String str = methodName;
                String fileName = el2.getFileName();
                if (fileName == null) {
                    fileName = "Unknown";
                }
                return new c1(str, fileName, Integer.valueOf(el2.getLineNumber()), a(className, projectPackages), null, null, 48, null);
            } catch (Exception e10) {
                logger.b("Failed to serialize stacktrace", e10);
                return null;
            }
        }
    }

    public d1(List<c1> list) {
        this.trace = b(list);
    }

    public final List<c1> a() {
        return this.trace;
    }

    public d1(StackTraceElement[] stackTraceElementArr, Collection<String> collection, D0 d02) {
        int iMin = Math.min(HttpResponseStatus.SUCCESS_OK, stackTraceElementArr.length);
        this.trace = new ArrayList(iMin);
        int i10 = 0;
        while (i10 < iMin) {
            int i11 = i10 + 1;
            c1 c1VarB = INSTANCE.b(stackTraceElementArr[i10], collection, d02);
            if (c1VarB != null) {
                this.trace.add(c1VarB);
            }
            i10 = i11;
        }
    }

    private final List<c1> b(List<c1> frames) {
        if (frames.size() >= 200) {
            return frames.subList(0, HttpResponseStatus.SUCCESS_OK);
        }
        return frames;
    }

    @Override // com.bugsnag.android.C6624v0.a
    public void toStream(C6624v0 writer) throws Throwable {
        writer.c();
        Iterator<T> it = this.trace.iterator();
        while (it.hasNext()) {
            writer.e0((c1) it.next());
        }
        writer.h();
    }
}
