package W5;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001:\u0001\tB-\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\t\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000e\u0010\fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\r\u0010\f¨\u0006\u000f"}, d2 = {"LW5/c;", "", "", "title", "message", "positiveButtonText", "negativeButtonText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "b", "c", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String title;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String message;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String positiveButtonText;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String negativeButtonText;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\u0007J\u0015\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u0007J\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u0016\u0010\b\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0011R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0011R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0011¨\u0006\u0012"}, d2 = {"LW5/c$a;", "", "<init>", "()V", "", "title", "e", "(Ljava/lang/String;)LW5/c$a;", "message", "b", "positiveButtonText", "d", "negativeButtonText", "c", "LW5/c;", "a", "()LW5/c;", "Ljava/lang/String;", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    @SourceDebugExtension
    public static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private String title = "";

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private String message = "";

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private String positiveButtonText;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private String negativeButtonText;

        public final c a() {
            if (this.positiveButtonText == null && this.negativeButtonText == null) {
                throw new IllegalArgumentException("At least one button must be defined.");
            }
            return new c(this.title, this.message, this.positiveButtonText, this.negativeButtonText, null);
        }

        public final a b(String message) {
            Intrinsics.j(message, "message");
            this.message = message;
            return this;
        }

        public final a c(String negativeButtonText) {
            Intrinsics.j(negativeButtonText, "negativeButtonText");
            this.negativeButtonText = negativeButtonText;
            return this;
        }

        public final a d(String positiveButtonText) {
            Intrinsics.j(positiveButtonText, "positiveButtonText");
            this.positiveButtonText = positiveButtonText;
            return this;
        }

        public final a e(String title) {
            Intrinsics.j(title, "title");
            this.title = title;
            return this;
        }
    }

    public /* synthetic */ c(String str, String str2, String str3, String str4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4);
    }

    private c(String str, String str2, String str3, String str4) {
        this.title = str;
        this.message = str2;
        this.positiveButtonText = str3;
        this.negativeButtonText = str4;
    }

    /* renamed from: a, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* renamed from: b, reason: from getter */
    public final String getNegativeButtonText() {
        return this.negativeButtonText;
    }

    /* renamed from: c, reason: from getter */
    public final String getPositiveButtonText() {
        return this.positiveButtonText;
    }

    /* renamed from: d, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
