package m5;

import android.graphics.drawable.Drawable;
import d5.EnumC13623g;
import k5.InterfaceC15089c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0016\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b#\u0010%\u001a\u0004\b!\u0010&R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b\r\u0010)R\u0017\u0010\u000e\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b*\u0010(\u001a\u0004\b'\u0010)¨\u0006+"}, d2 = {"Lm5/p;", "Lm5/i;", "Landroid/graphics/drawable/Drawable;", "drawable", "Lm5/h;", "request", "Ld5/g;", "dataSource", "Lk5/c$b;", "memoryCacheKey", "", "diskCacheKey", "", "isSampled", "isPlaceholderCached", "<init>", "(Landroid/graphics/drawable/Drawable;Lm5/h;Ld5/g;Lk5/c$b;Ljava/lang/String;ZZ)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Landroid/graphics/drawable/Drawable;", "()Landroid/graphics/drawable/Drawable;", "b", "Lm5/h;", "()Lm5/h;", "c", "Ld5/g;", "()Ld5/g;", "d", "Lk5/c$b;", "e", "()Lk5/c$b;", "Ljava/lang/String;", "()Ljava/lang/String;", "f", "Z", "()Z", "g", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: m5.p, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C15677p extends AbstractC15670i {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Drawable drawable;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C15669h request;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final EnumC13623g dataSource;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC15089c.Key memoryCacheKey;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final String diskCacheKey;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean isSampled;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final boolean isPlaceholderCached;

    public C15677p(Drawable drawable, C15669h c15669h, EnumC13623g enumC13623g, InterfaceC15089c.Key key, String str, boolean z10, boolean z11) {
        super(null);
        this.drawable = drawable;
        this.request = c15669h;
        this.dataSource = enumC13623g;
        this.memoryCacheKey = key;
        this.diskCacheKey = str;
        this.isSampled = z10;
        this.isPlaceholderCached = z11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C15677p)) {
            return false;
        }
        C15677p c15677p = (C15677p) other;
        return Intrinsics.e(getDrawable(), c15677p.getDrawable()) && Intrinsics.e(getRequest(), c15677p.getRequest()) && this.dataSource == c15677p.dataSource && Intrinsics.e(this.memoryCacheKey, c15677p.memoryCacheKey) && Intrinsics.e(this.diskCacheKey, c15677p.diskCacheKey) && this.isSampled == c15677p.isSampled && this.isPlaceholderCached == c15677p.isPlaceholderCached;
    }

    @Override // m5.AbstractC15670i
    /* renamed from: a, reason: from getter */
    public Drawable getDrawable() {
        return this.drawable;
    }

    @Override // m5.AbstractC15670i
    /* renamed from: b, reason: from getter */
    public C15669h getRequest() {
        return this.request;
    }

    /* renamed from: c, reason: from getter */
    public final EnumC13623g getDataSource() {
        return this.dataSource;
    }

    /* renamed from: d, reason: from getter */
    public final String getDiskCacheKey() {
        return this.diskCacheKey;
    }

    /* renamed from: e, reason: from getter */
    public final InterfaceC15089c.Key getMemoryCacheKey() {
        return this.memoryCacheKey;
    }

    /* renamed from: f, reason: from getter */
    public final boolean getIsPlaceholderCached() {
        return this.isPlaceholderCached;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2 = ((((getDrawable().hashCode() * 31) + getRequest().hashCode()) * 31) + this.dataSource.hashCode()) * 31;
        InterfaceC15089c.Key key = this.memoryCacheKey;
        int iHashCode3 = 0;
        if (key != null) {
            iHashCode = key.hashCode();
        } else {
            iHashCode = 0;
        }
        int i10 = (iHashCode2 + iHashCode) * 31;
        String str = this.diskCacheKey;
        if (str != null) {
            iHashCode3 = str.hashCode();
        }
        return ((((i10 + iHashCode3) * 31) + Boolean.hashCode(this.isSampled)) * 31) + Boolean.hashCode(this.isPlaceholderCached);
    }
}
