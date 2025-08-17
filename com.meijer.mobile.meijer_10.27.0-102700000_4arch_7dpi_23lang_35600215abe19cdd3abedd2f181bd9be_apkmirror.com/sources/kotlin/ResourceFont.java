package kotlin;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B9\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0003\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR \u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u001b\u0010\u0014R\u0017\u0010\t\u001a\u00020\b8\u0007¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!R&\u0010\u000b\u001a\u00020\n8WX\u0097\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\"\u0010\u0019\u0012\u0004\b#\u0010$\u001a\u0004\b\u0018\u0010\u0014\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006%"}, d2 = {"Ly1/P;", "Ly1/k;", "", "resId", "Ly1/B;", "weight", "Ly1/w;", "style", "Ly1/A;", "variationSettings", "Ly1/u;", "loadingStrategy", "<init>", "(ILy1/B;ILy1/A;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "b", "I", "d", "c", "Ly1/B;", "a", "()Ly1/B;", "e", "Ly1/A;", "()Ly1/A;", "f", "getLoadingStrategy-PKNRLFQ$annotations", "()V", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: y1.P, reason: case insensitive filesystem and from toString */
/* loaded from: classes.dex */
public final class ResourceFont implements InterfaceC18141k {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int resId;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final FontWeight weight;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int style;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final C18107A variationSettings;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final int loadingStrategy;

    public /* synthetic */ ResourceFont(int i10, FontWeight fontWeight, int i11, C18107A c18107a, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, fontWeight, i11, c18107a, i12);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResourceFont)) {
            return false;
        }
        ResourceFont resourceFont = (ResourceFont) other;
        return this.resId == resourceFont.resId && Intrinsics.e(getWeight(), resourceFont.getWeight()) && C18153w.f(getStyle(), resourceFont.getStyle()) && Intrinsics.e(this.variationSettings, resourceFont.variationSettings) && C18151u.e(getLoadingStrategy(), resourceFont.getLoadingStrategy());
    }

    private ResourceFont(int i10, FontWeight fontWeight, int i11, C18107A c18107a, int i12) {
        this.resId = i10;
        this.weight = fontWeight;
        this.style = i11;
        this.variationSettings = c18107a;
        this.loadingStrategy = i12;
    }

    @Override // kotlin.InterfaceC18141k
    /* renamed from: a, reason: from getter */
    public FontWeight getWeight() {
        return this.weight;
    }

    @Override // kotlin.InterfaceC18141k
    /* renamed from: b, reason: from getter */
    public int getLoadingStrategy() {
        return this.loadingStrategy;
    }

    @Override // kotlin.InterfaceC18141k
    /* renamed from: c, reason: from getter */
    public int getStyle() {
        return this.style;
    }

    /* renamed from: d, reason: from getter */
    public final int getResId() {
        return this.resId;
    }

    /* renamed from: e, reason: from getter */
    public final C18107A getVariationSettings() {
        return this.variationSettings;
    }

    public int hashCode() {
        return (((((((this.resId * 31) + getWeight().hashCode()) * 31) + C18153w.g(getStyle())) * 31) + C18151u.f(getLoadingStrategy())) * 31) + this.variationSettings.hashCode();
    }

    public String toString() {
        return "ResourceFont(resId=" + this.resId + ", weight=" + getWeight() + ", style=" + ((Object) C18153w.h(getStyle())) + ", loadingStrategy=" + ((Object) C18151u.g(getLoadingStrategy())) + ')';
    }
}
