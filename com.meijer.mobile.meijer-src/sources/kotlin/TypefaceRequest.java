package kotlin;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0080\b\u0018\u00002\u00020\u0001B3\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u000b\u0010\fJI\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0001HÆ\u0001ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010\u0007\u001a\u00020\u00068\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001a\u0010 \u001a\u0004\b!\u0010\u0014R\u001d\u0010\t\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b!\u0010 \u001a\u0004\b\"\u0010\u0014R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006&"}, d2 = {"Ly1/W;", "", "Ly1/l;", "fontFamily", "Ly1/B;", "fontWeight", "Ly1/w;", "fontStyle", "Ly1/x;", "fontSynthesis", "resourceLoaderCacheKey", "<init>", "(Ly1/l;Ly1/B;IILjava/lang/Object;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "a", "(Ly1/l;Ly1/B;IILjava/lang/Object;)Ly1/W;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ly1/l;", "c", "()Ly1/l;", "b", "Ly1/B;", "f", "()Ly1/B;", "I", "d", "e", "Ljava/lang/Object;", "getResourceLoaderCacheKey", "()Ljava/lang/Object;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: y1.W, reason: case insensitive filesystem and from toString */
/* loaded from: classes.dex */
public final /* data */ class TypefaceRequest {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC18269l fontFamily;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final FontWeight fontWeight;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int fontStyle;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final int fontSynthesis;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final Object resourceLoaderCacheKey;

    public /* synthetic */ TypefaceRequest(AbstractC18269l abstractC18269l, FontWeight fontWeight, int i10, int i11, Object obj, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC18269l, fontWeight, i10, i11, obj);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TypefaceRequest)) {
            return false;
        }
        TypefaceRequest typefaceRequest = (TypefaceRequest) other;
        return Intrinsics.e(this.fontFamily, typefaceRequest.fontFamily) && Intrinsics.e(this.fontWeight, typefaceRequest.fontWeight) && C18280w.f(this.fontStyle, typefaceRequest.fontStyle) && C18281x.h(this.fontSynthesis, typefaceRequest.fontSynthesis) && Intrinsics.e(this.resourceLoaderCacheKey, typefaceRequest.resourceLoaderCacheKey);
    }

    private TypefaceRequest(AbstractC18269l abstractC18269l, FontWeight fontWeight, int i10, int i11, Object obj) {
        this.fontFamily = abstractC18269l;
        this.fontWeight = fontWeight;
        this.fontStyle = i10;
        this.fontSynthesis = i11;
        this.resourceLoaderCacheKey = obj;
    }

    public static /* synthetic */ TypefaceRequest b(TypefaceRequest typefaceRequest, AbstractC18269l abstractC18269l, FontWeight fontWeight, int i10, int i11, Object obj, int i12, Object obj2) {
        if ((i12 & 1) != 0) {
            abstractC18269l = typefaceRequest.fontFamily;
        }
        if ((i12 & 2) != 0) {
            fontWeight = typefaceRequest.fontWeight;
        }
        if ((i12 & 4) != 0) {
            i10 = typefaceRequest.fontStyle;
        }
        if ((i12 & 8) != 0) {
            i11 = typefaceRequest.fontSynthesis;
        }
        if ((i12 & 16) != 0) {
            obj = typefaceRequest.resourceLoaderCacheKey;
        }
        Object obj3 = obj;
        int i13 = i10;
        return typefaceRequest.a(abstractC18269l, fontWeight, i13, i11, obj3);
    }

    public final TypefaceRequest a(AbstractC18269l fontFamily, FontWeight fontWeight, int fontStyle, int fontSynthesis, Object resourceLoaderCacheKey) {
        return new TypefaceRequest(fontFamily, fontWeight, fontStyle, fontSynthesis, resourceLoaderCacheKey, null);
    }

    /* renamed from: c, reason: from getter */
    public final AbstractC18269l getFontFamily() {
        return this.fontFamily;
    }

    /* renamed from: d, reason: from getter */
    public final int getFontStyle() {
        return this.fontStyle;
    }

    /* renamed from: e, reason: from getter */
    public final int getFontSynthesis() {
        return this.fontSynthesis;
    }

    /* renamed from: f, reason: from getter */
    public final FontWeight getFontWeight() {
        return this.fontWeight;
    }

    public int hashCode() {
        AbstractC18269l abstractC18269l = this.fontFamily;
        int iHashCode = (((((((abstractC18269l == null ? 0 : abstractC18269l.hashCode()) * 31) + this.fontWeight.hashCode()) * 31) + C18280w.g(this.fontStyle)) * 31) + C18281x.i(this.fontSynthesis)) * 31;
        Object obj = this.resourceLoaderCacheKey;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }

    public String toString() {
        return "TypefaceRequest(fontFamily=" + this.fontFamily + ", fontWeight=" + this.fontWeight + ", fontStyle=" + ((Object) C18280w.h(this.fontStyle)) + ", fontSynthesis=" + ((Object) C18281x.l(this.fontSynthesis)) + ", resourceLoaderCacheKey=" + this.resourceLoaderCacheKey + ')';
    }
}
