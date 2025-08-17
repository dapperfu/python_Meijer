package Co;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import mk.g;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001f\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B=\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\n¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\n¢\u0006\u0004\b\u0017\u0010\u0018JF\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0018J\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u001cR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010$\u001a\u0004\b'\u0010\u001cR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010/\u001a\u0004\b0\u00101R!\u00107\u001a\u00020\u00038VX\u0096\u0084\u0002¢\u0006\u0012\n\u0004\b2\u00103\u0012\u0004\b5\u00106\u001a\u0004\b4\u0010\u001cR!\u0010\u000e\u001a\u00020\n8VX\u0096\u0084\u0002¢\u0006\u0012\n\u0004\b8\u00103\u0012\u0004\b9\u00106\u001a\u0004\b2\u0010\u0018R\u0014\u0010<\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0014\u0010>\u001a\u00020 8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b=\u0010;¨\u0006?"}, d2 = {"LCo/e;", "Lmk/g;", "Landroid/os/Parcelable;", "", "url", "altText", "Lmk/g$b;", "format", "Lmk/g$c;", "imageType", "", "galleryIndex", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lmk/g$b;Lmk/g$c;Ljava/lang/Integer;)V", "size", "j", "(I)LCo/e;", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "c", "(Ljava/lang/String;Ljava/lang/String;Lmk/g$b;Lmk/g$c;Ljava/lang/Integer;)LCo/e;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getUrl", "b", "F0", "Lmk/g$b;", "getFormat", "()Lmk/g$b;", "d", "Lmk/g$c;", "e", "()Lmk/g$c;", "Ljava/lang/Integer;", "getGalleryIndex", "()Ljava/lang/Integer;", "f", "Lkotlin/Lazy;", "a1", "getImageId$annotations", "()V", "imageId", "g", "getSize$annotations", "z", "()Z", "isPrimary", "h", "isSupportedImage", "fulldetails_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: Co.e, reason: from toString */
/* loaded from: classes11.dex */
public final /* data */ class Image implements mk.g, Parcelable {
    public static final Parcelable.Creator<Image> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String url;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String altText;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final g.b format;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final g.c imageType;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer galleryIndex;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Lazy imageId;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Lazy size;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Co.e$a */
    public static final class a implements Parcelable.Creator<Image> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Image createFromParcel(Parcel parcel) {
            Intrinsics.j(parcel, "parcel");
            return new Image(parcel.readString(), parcel.readString(), g.b.valueOf(parcel.readString()), g.c.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Image[] newArray(int i10) {
            return new Image[i10];
        }
    }

    public Image() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Image)) {
            return false;
        }
        Image image = (Image) other;
        return Intrinsics.e(this.url, image.url) && Intrinsics.e(this.altText, image.altText) && this.format == image.format && this.imageType == image.imageType && Intrinsics.e(this.galleryIndex, image.galleryIndex);
    }

    public Image(String url, String str, g.b format, g.c imageType, Integer num) {
        Intrinsics.j(url, "url");
        Intrinsics.j(format, "format");
        Intrinsics.j(imageType, "imageType");
        this.url = url;
        this.altText = str;
        this.format = format;
        this.imageType = imageType;
        this.galleryIndex = num;
        this.imageId = LazyKt.b(new Function0() { // from class: Co.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Image.g(this.f4307a);
            }
        });
        this.size = LazyKt.b(new Function0() { // from class: Co.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(Image.i(this.f4308a));
            }
        });
    }

    public static /* synthetic */ Image d(Image image, String str, String str2, g.b bVar, g.c cVar, Integer num, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = image.url;
        }
        if ((i10 & 2) != 0) {
            str2 = image.altText;
        }
        if ((i10 & 4) != 0) {
            bVar = image.format;
        }
        if ((i10 & 8) != 0) {
            cVar = image.imageType;
        }
        if ((i10 & 16) != 0) {
            num = image.galleryIndex;
        }
        Integer num2 = num;
        g.b bVar2 = bVar;
        return image.c(str, str2, bVar2, cVar, num2);
    }

    @Override // mk.g
    /* renamed from: F0, reason: from getter */
    public String getAltText() {
        return this.altText;
    }

    @Override // mk.g
    public String a1() {
        return (String) this.imageId.getValue();
    }

    public final Image c(String url, String altText, g.b format, g.c imageType, Integer galleryIndex) {
        Intrinsics.j(url, "url");
        Intrinsics.j(format, "format");
        Intrinsics.j(imageType, "imageType");
        return new Image(url, altText, format, imageType, galleryIndex);
    }

    /* renamed from: e, reason: from getter */
    public g.c getImageType() {
        return this.imageType;
    }

    public int f() {
        return ((Number) this.size.getValue()).intValue();
    }

    @Override // mk.g
    public String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int iHashCode = this.url.hashCode() * 31;
        String str = this.altText;
        int iHashCode2 = (((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.format.hashCode()) * 31) + this.imageType.hashCode()) * 31;
        Integer num = this.galleryIndex;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "Image(url=" + this.url + ", altText=" + this.altText + ", format=" + this.format + ", imageType=" + this.imageType + ", galleryIndex=" + this.galleryIndex + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.j(dest, "dest");
        dest.writeString(this.url);
        dest.writeString(this.altText);
        dest.writeString(this.format.name());
        dest.writeString(this.imageType.name());
        Integer num = this.galleryIndex;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String g(Image image) {
        return StringsKt.R0(image.getUrl(), "_", "", null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int i(Image image) {
        String strSubstring = (String) CollectionsKt.D0(StringsKt.a1(image.getUrl(), new String[]{"_"}, false, 0, 6, null));
        int length = strSubstring.length();
        int i10 = 0;
        while (true) {
            if (i10 < length) {
                if (strSubstring.charAt(i10) != '.') {
                    i10++;
                } else {
                    strSubstring = strSubstring.substring(0, i10);
                    Intrinsics.i(strSubstring, "substring(...)");
                    break;
                }
            } else {
                break;
            }
        }
        return Integer.parseInt(strSubstring);
    }

    @SuppressLint({"DefaultLocale"})
    public boolean h() {
        String url = getUrl();
        Locale ROOT = Locale.ROOT;
        Intrinsics.i(ROOT, "ROOT");
        String lowerCase = url.toLowerCase(ROOT);
        Intrinsics.i(lowerCase, "toLowerCase(...)");
        return new Regex(".*\\.(png|jpe?g)").j(lowerCase);
    }

    public Image j(int size) {
        g.b bVar;
        String url = getUrl();
        StringCompanionObject stringCompanionObject = StringCompanionObject.f142841a;
        String str = String.format("%04d.png", Arrays.copyOf(new Object[]{Integer.valueOf(size)}, 1));
        Intrinsics.i(str, "format(...)");
        String strR0 = StringsKt.R0(url, "_", str, null, 4, null);
        if (size <= 150) {
            bVar = g.b.f150126b;
        } else {
            bVar = g.b.f150127c;
        }
        return d(this, strR0, null, bVar, null, null, 26, null);
    }

    @Override // mk.g
    public boolean z() {
        if (getImageType() == g.c.f150132b) {
            return true;
        }
        return false;
    }

    public /* synthetic */ Image(String str, String str2, g.b bVar, g.c cVar, Integer num, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? g.b.f150127c : bVar, (i10 & 8) != 0 ? g.c.f150132b : cVar, (i10 & 16) != 0 ? 0 : num);
    }
}
