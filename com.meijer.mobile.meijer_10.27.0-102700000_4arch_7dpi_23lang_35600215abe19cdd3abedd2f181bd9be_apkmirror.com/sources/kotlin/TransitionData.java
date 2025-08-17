package kotlin;

import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0018\b\u0081\b\u0018\u00002\u00020\u0001B[\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u0018\b\u0002\u0010\r\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0001\u0012\u0004\u0012\u00020\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010!\u001a\u0004\b\u0019\u0010\"R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b%\u0010'\u001a\u0004\b#\u0010(R'\u0010\r\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0001\u0012\u0004\u0012\u00020\u00010\f8\u0006¢\u0006\f\n\u0004\b\u001f\u0010)\u001a\u0004\b\u001d\u0010*¨\u0006+"}, d2 = {"Lb0/z;", "", "Lb0/m;", "fade", "Lb0/v;", "slide", "Lb0/g;", "changeSize", "Lb0/s;", "scale", "", "hold", "", "effectsMap", "<init>", "(Lb0/m;Lb0/v;Lb0/g;Lb0/s;ZLjava/util/Map;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lb0/m;", "c", "()Lb0/m;", "b", "Lb0/v;", "f", "()Lb0/v;", "Lb0/g;", "()Lb0/g;", "d", "Lb0/s;", "e", "()Lb0/s;", "Z", "()Z", "Ljava/util/Map;", "()Ljava/util/Map;", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: b0.z, reason: from toString */
/* loaded from: classes.dex */
public final /* data */ class TransitionData {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Fade fade;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Slide slide;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final ChangeSize changeSize;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Scale scale;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean hold;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final Map<Object, Object> effectsMap;

    public TransitionData() {
        this(null, null, null, null, false, null, 63, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransitionData)) {
            return false;
        }
        TransitionData transitionData = (TransitionData) other;
        return Intrinsics.e(this.fade, transitionData.fade) && Intrinsics.e(this.slide, transitionData.slide) && Intrinsics.e(this.changeSize, transitionData.changeSize) && Intrinsics.e(this.scale, transitionData.scale) && this.hold == transitionData.hold && Intrinsics.e(this.effectsMap, transitionData.effectsMap);
    }

    public TransitionData(Fade fade, Slide slide, ChangeSize changeSize, Scale scale, boolean z10, Map<Object, Object> map) {
        this.fade = fade;
        this.slide = slide;
        this.changeSize = changeSize;
        this.scale = scale;
        this.hold = z10;
        this.effectsMap = map;
    }

    /* renamed from: a, reason: from getter */
    public final ChangeSize getChangeSize() {
        return this.changeSize;
    }

    public final Map<Object, Object> b() {
        return this.effectsMap;
    }

    /* renamed from: c, reason: from getter */
    public final Fade getFade() {
        return this.fade;
    }

    /* renamed from: d, reason: from getter */
    public final boolean getHold() {
        return this.hold;
    }

    /* renamed from: e, reason: from getter */
    public final Scale getScale() {
        return this.scale;
    }

    /* renamed from: f, reason: from getter */
    public final Slide getSlide() {
        return this.slide;
    }

    public int hashCode() {
        Fade fade = this.fade;
        int iHashCode = (fade == null ? 0 : fade.hashCode()) * 31;
        Slide slide = this.slide;
        int iHashCode2 = (iHashCode + (slide == null ? 0 : slide.hashCode())) * 31;
        ChangeSize changeSize = this.changeSize;
        int iHashCode3 = (iHashCode2 + (changeSize == null ? 0 : changeSize.hashCode())) * 31;
        Scale scale = this.scale;
        return ((((iHashCode3 + (scale != null ? scale.hashCode() : 0)) * 31) + Boolean.hashCode(this.hold)) * 31) + this.effectsMap.hashCode();
    }

    public String toString() {
        return "TransitionData(fade=" + this.fade + ", slide=" + this.slide + ", changeSize=" + this.changeSize + ", scale=" + this.scale + ", hold=" + this.hold + ", effectsMap=" + this.effectsMap + ')';
    }

    public /* synthetic */ TransitionData(Fade fade, Slide slide, ChangeSize changeSize, Scale scale, boolean z10, Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : fade, (i10 & 2) != 0 ? null : slide, (i10 & 4) != 0 ? null : changeSize, (i10 & 8) != 0 ? null : scale, (i10 & 16) != 0 ? false : z10, (i10 & 32) != 0 ? MapsKt.k() : map);
    }
}
