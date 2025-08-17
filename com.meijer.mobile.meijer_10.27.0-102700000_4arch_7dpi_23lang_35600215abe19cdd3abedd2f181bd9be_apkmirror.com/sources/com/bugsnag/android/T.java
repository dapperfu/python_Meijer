package com.bugsnag.android;

import com.bugsnag.android.C6482m0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u0000 \u00192\u00020\u0001:\u0001\u0012B-\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0012\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018\"\u0004\b\u001b\u0010\u001aR\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lcom/bugsnag/android/T;", "Lcom/bugsnag/android/m0$a;", "", "errorClass", "errorMessage", "Lcom/bugsnag/android/S0;", "stacktrace", "Lcom/bugsnag/android/ErrorType;", "type", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/bugsnag/android/S0;Lcom/bugsnag/android/ErrorType;)V", "Lcom/bugsnag/android/m0;", "writer", "", "toStream", "(Lcom/bugsnag/android/m0;)V", "", "Lcom/bugsnag/android/R0;", "a", "Ljava/util/List;", "c", "()Ljava/util/List;", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "e", "(Ljava/lang/String;)V", "f", "d", "Lcom/bugsnag/android/ErrorType;", "()Lcom/bugsnag/android/ErrorType;", "g", "(Lcom/bugsnag/android/ErrorType;)V", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes4.dex */
public final class T implements C6482m0.a {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<R0> stacktrace;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private String errorClass;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private String errorMessage;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private ErrorType type;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/bugsnag/android/T$a;", "", "<init>", "()V", "", "exc", "", "", "projectPackages", "Lcom/bugsnag/android/t0;", "logger", "", "Lcom/bugsnag/android/S;", "a", "(Ljava/lang/Throwable;Ljava/util/Collection;Lcom/bugsnag/android/t0;)Ljava/util/List;", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
    /* renamed from: com.bugsnag.android.T$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List<S> a(Throwable exc, Collection<String> projectPackages, InterfaceC6495t0 logger) {
            List<Throwable> listA = e1.a(exc);
            ArrayList arrayList = new ArrayList();
            for (Throwable th2 : listA) {
                StackTraceElement[] stackTrace = th2.getStackTrace();
                if (stackTrace == null) {
                    stackTrace = new StackTraceElement[0];
                }
                S0 s02 = new S0(stackTrace, projectPackages, logger);
                String name = th2.getClass().getName();
                Intrinsics.f(name, "currentEx.javaClass.name");
                arrayList.add(new S(new T(name, th2.getLocalizedMessage(), s02, null, 8, null), logger));
            }
            return arrayList;
        }
    }

    @JvmOverloads
    public T(String str, String str2, S0 s02, ErrorType errorType) {
        this.errorClass = str;
        this.errorMessage = str2;
        this.type = errorType;
        this.stacktrace = s02.a();
    }

    /* renamed from: a, reason: from getter */
    public final String getErrorClass() {
        return this.errorClass;
    }

    /* renamed from: b, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final List<R0> c() {
        return this.stacktrace;
    }

    /* renamed from: d, reason: from getter */
    public final ErrorType getType() {
        return this.type;
    }

    public final void e(String str) {
        this.errorClass = str;
    }

    public final void f(String str) {
        this.errorMessage = str;
    }

    public final void g(ErrorType errorType) {
        this.type = errorType;
    }

    public /* synthetic */ T(String str, String str2, S0 s02, ErrorType errorType, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, s02, (i10 & 8) != 0 ? ErrorType.ANDROID : errorType);
    }

    @Override // com.bugsnag.android.C6482m0.a
    public void toStream(C6482m0 writer) {
        writer.d();
        writer.l("errorClass").O(this.errorClass);
        writer.l("message").O(this.errorMessage);
        writer.l("type").O(this.type.getDesc());
        writer.l("stacktrace").e0(this.stacktrace);
        writer.i();
    }
}
