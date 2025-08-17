package mk;

import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\bf\u0018\u0000 \u000e2\u00020\u0001:\u0003\u000f\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0004R\u0014\u0010\r\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0012À\u0006\u0001"}, d2 = {"Lmk/g;", "Landroid/os/Parcelable;", "", "getUrl", "()Ljava/lang/String;", "url", "F0", "altText", "a1", "imageId", "", "z", "()Z", "isPrimary", "t3", "b", "c", "a", "models_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface g extends Parcelable {

    /* renamed from: t3, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f150125a;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lmk/g$a;", "", "<init>", "()V", "", "dimension", "Lmk/g$b;", "a", "(I)Lmk/g$b;", "models_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: mk.g$a, reason: from kotlin metadata */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f150125a = new Companion();

        public final b a(int dimension) {
            return dimension >= 1200 ? b.f150128d : dimension >= 600 ? b.f150127c : b.f150126b;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lmk/g$b;", "", "", "format", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "Ljava/lang/String;", "getFormat", "()Ljava/lang/String;", "b", "c", "d", "models_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b {

        /* renamed from: b, reason: collision with root package name */
        public static final b f150126b = new b("THUMBNAIL", 0, "thumbnail");

        /* renamed from: c, reason: collision with root package name */
        public static final b f150127c = new b("PRODUCT", 1, "product");

        /* renamed from: d, reason: collision with root package name */
        public static final b f150128d = new b("ZOOM", 2, "zoom");

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ b[] f150129e;

        /* renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f150130f;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String format;

        public static EnumEntries<b> b() {
            return f150130f;
        }

        static {
            b[] bVarArrA = a();
            f150129e = bVarArrA;
            f150130f = EnumEntriesKt.a(bVarArrA);
        }

        private static final /* synthetic */ b[] a() {
            return new b[]{f150126b, f150127c, f150128d};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f150129e.clone();
        }

        public final String getFormat() {
            return this.format;
        }

        private b(String str, int i10, String str2) {
            this.format = str2;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0013\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lmk/g$c;", "", "", "type", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "b", "c", "models_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c {

        /* renamed from: b, reason: collision with root package name */
        public static final c f150132b = new c("PRIMARY", 0, "PRIMARY");

        /* renamed from: c, reason: collision with root package name */
        public static final c f150133c = new c("GALLERY", 1, "GALLERY");

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ c[] f150134d;

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f150135e;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String type;

        public static EnumEntries<c> b() {
            return f150135e;
        }

        static {
            c[] cVarArrA = a();
            f150134d = cVarArrA;
            f150135e = EnumEntriesKt.a(cVarArrA);
        }

        private static final /* synthetic */ c[] a() {
            return new c[]{f150132b, f150133c};
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f150134d.clone();
        }

        /* renamed from: e, reason: from getter */
        public final String getType() {
            return this.type;
        }

        private c(String str, int i10, String str2) {
            this.type = str2;
        }
    }

    /* renamed from: F0 */
    String getAltText();

    String a1();

    String getUrl();

    boolean z();
}
