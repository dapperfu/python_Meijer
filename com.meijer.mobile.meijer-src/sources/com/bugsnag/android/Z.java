package com.bugsnag.android;

import com.bugsnag.android.C6624v0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00132\u00020\u0001:\u0001\u0010B-\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014R\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001f\u001a\u0004\b\u0017\u0010 ¨\u0006!"}, d2 = {"Lcom/bugsnag/android/Z;", "Lcom/bugsnag/android/v0$a;", "", "errorClass", "errorMessage", "Lcom/bugsnag/android/d1;", "stacktrace", "Lcom/bugsnag/android/ErrorType;", "type", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/bugsnag/android/d1;Lcom/bugsnag/android/ErrorType;)V", "Lcom/bugsnag/android/v0;", "writer", "", "toStream", "(Lcom/bugsnag/android/v0;)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "e", "(Ljava/lang/String;)V", "b", "f", "c", "Lcom/bugsnag/android/ErrorType;", "d", "()Lcom/bugsnag/android/ErrorType;", "g", "(Lcom/bugsnag/android/ErrorType;)V", "", "Lcom/bugsnag/android/c1;", "Ljava/util/List;", "()Ljava/util/List;", "bugsnag-android-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class Z implements C6624v0.a {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private String errorClass;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private String errorMessage;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private ErrorType type;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final List<c1> stacktrace;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/bugsnag/android/Z$a;", "", "<init>", "()V", "", "exc", "", "", "projectPackages", "Lcom/bugsnag/android/D0;", "logger", "", "Lcom/bugsnag/android/Y;", "a", "(Ljava/lang/Throwable;Ljava/util/Collection;Lcom/bugsnag/android/D0;)Ljava/util/List;", "bugsnag-android-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.bugsnag.android.Z$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<Y> a(Throwable exc, Collection<String> projectPackages, D0 logger) {
            List<Throwable> listA = o1.a(exc);
            ArrayList arrayList = new ArrayList();
            for (Throwable th2 : listA) {
                StackTraceElement[] stackTrace = th2.getStackTrace();
                if (stackTrace == null) {
                    stackTrace = new StackTraceElement[0];
                }
                arrayList.add(new Y(new Z(th2.getClass().getName(), th2.getLocalizedMessage(), new d1(stackTrace, projectPackages, logger), null, 8, null), logger));
            }
            return arrayList;
        }
    }

    @JvmOverloads
    public Z(String str, String str2, d1 d1Var, ErrorType errorType) {
        this.errorClass = str;
        this.errorMessage = str2;
        this.type = errorType;
        this.stacktrace = d1Var.a();
    }

    /* renamed from: a, reason: from getter */
    public final String getErrorClass() {
        return this.errorClass;
    }

    /* renamed from: b, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final List<c1> c() {
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

    @Override // com.bugsnag.android.C6624v0.a
    public void toStream(C6624v0 writer) {
        writer.d();
        writer.l("errorClass").O(this.errorClass);
        writer.l("message").O(this.errorMessage);
        writer.l("type").O(this.type.getDesc());
        writer.l("stacktrace").e0(this.stacktrace);
        writer.i();
    }

    public /* synthetic */ Z(String str, String str2, d1 d1Var, ErrorType errorType, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, d1Var, (i10 & 8) != 0 ? ErrorType.ANDROID : errorType);
    }
}
