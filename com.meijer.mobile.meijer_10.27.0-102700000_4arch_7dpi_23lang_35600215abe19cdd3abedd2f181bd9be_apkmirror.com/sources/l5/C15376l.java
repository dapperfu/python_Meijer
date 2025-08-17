package l5;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.os.Build;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m5.EnumC15558h;
import m5.Size;
import okhttp3.Headers;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b)\u0018\u00002\u00020\u0001B\u009f\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0018¢\u0006\u0004\b\u001c\u0010\u001dJ§\u0001\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u0018¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010!\u001a\u00020\f2\b\u0010 \u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b/\u00105\u001a\u0004\b6\u00107R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b+\u00108\u001a\u0004\b-\u00109R\u0017\u0010\u000e\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b'\u00108\u001a\u0004\b1\u00109R\u0017\u0010\u000f\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b:\u00108\u001a\u0004\b;\u00109R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b:\u0010>R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\b?\u0010AR\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b;\u0010F\u001a\u0004\bG\u0010HR\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b6\u0010I\u001a\u0004\bJ\u0010KR\u0017\u0010\u001a\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b3\u0010I\u001a\u0004\b<\u0010KR\u0017\u0010\u001b\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\bD\u0010I\u001a\u0004\bB\u0010K¨\u0006L"}, d2 = {"Ll5/l;", "", "Landroid/content/Context;", "context", "Landroid/graphics/Bitmap$Config;", "config", "Landroid/graphics/ColorSpace;", "colorSpace", "Lm5/i;", "size", "Lm5/h;", "scale", "", "allowInexactSize", "allowRgb565", "premultipliedAlpha", "", "diskCacheKey", "Lokhttp3/Headers;", "headers", "Ll5/q;", "tags", "Ll5/m;", "parameters", "Ll5/b;", "memoryCachePolicy", "diskCachePolicy", "networkCachePolicy", "<init>", "(Landroid/content/Context;Landroid/graphics/Bitmap$Config;Landroid/graphics/ColorSpace;Lm5/i;Lm5/h;ZZZLjava/lang/String;Lokhttp3/Headers;Ll5/q;Ll5/m;Ll5/b;Ll5/b;Ll5/b;)V", "a", "(Landroid/content/Context;Landroid/graphics/Bitmap$Config;Landroid/graphics/ColorSpace;Lm5/i;Lm5/h;ZZZLjava/lang/String;Lokhttp3/Headers;Ll5/q;Ll5/m;Ll5/b;Ll5/b;Ll5/b;)Ll5/l;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/content/Context;", "g", "()Landroid/content/Context;", "b", "Landroid/graphics/Bitmap$Config;", "f", "()Landroid/graphics/Bitmap$Config;", "c", "Landroid/graphics/ColorSpace;", "e", "()Landroid/graphics/ColorSpace;", "d", "Lm5/i;", "n", "()Lm5/i;", "Lm5/h;", "m", "()Lm5/h;", "Z", "()Z", "h", "l", "i", "Ljava/lang/String;", "()Ljava/lang/String;", "j", "Lokhttp3/Headers;", "()Lokhttp3/Headers;", "k", "Ll5/q;", "o", "()Ll5/q;", "Ll5/m;", "getParameters", "()Ll5/m;", "Ll5/b;", "getMemoryCachePolicy", "()Ll5/b;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: l5.l, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C15376l {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Bitmap.Config config;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ColorSpace colorSpace;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Size size;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final EnumC15558h scale;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean allowInexactSize;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final boolean allowRgb565;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final boolean premultipliedAlpha;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final String diskCacheKey;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final Headers headers;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final Tags tags;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final Parameters parameters;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final EnumC15366b memoryCachePolicy;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final EnumC15366b diskCachePolicy;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final EnumC15366b networkCachePolicy;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C15376l)) {
            return false;
        }
        C15376l c15376l = (C15376l) other;
        if (Intrinsics.e(this.context, c15376l.context) && this.config == c15376l.config) {
            return (Build.VERSION.SDK_INT < 26 || Intrinsics.e(this.colorSpace, c15376l.colorSpace)) && Intrinsics.e(this.size, c15376l.size) && this.scale == c15376l.scale && this.allowInexactSize == c15376l.allowInexactSize && this.allowRgb565 == c15376l.allowRgb565 && this.premultipliedAlpha == c15376l.premultipliedAlpha && Intrinsics.e(this.diskCacheKey, c15376l.diskCacheKey) && Intrinsics.e(this.headers, c15376l.headers) && Intrinsics.e(this.tags, c15376l.tags) && Intrinsics.e(this.parameters, c15376l.parameters) && this.memoryCachePolicy == c15376l.memoryCachePolicy && this.diskCachePolicy == c15376l.diskCachePolicy && this.networkCachePolicy == c15376l.networkCachePolicy;
        }
        return false;
    }

    public final C15376l a(Context context, Bitmap.Config config, ColorSpace colorSpace, Size size, EnumC15558h scale, boolean allowInexactSize, boolean allowRgb565, boolean premultipliedAlpha, String diskCacheKey, Headers headers, Tags tags, Parameters parameters, EnumC15366b memoryCachePolicy, EnumC15366b diskCachePolicy, EnumC15366b networkCachePolicy) {
        return new C15376l(context, config, colorSpace, size, scale, allowInexactSize, allowRgb565, premultipliedAlpha, diskCacheKey, headers, tags, parameters, memoryCachePolicy, diskCachePolicy, networkCachePolicy);
    }

    /* renamed from: c, reason: from getter */
    public final boolean getAllowInexactSize() {
        return this.allowInexactSize;
    }

    /* renamed from: d, reason: from getter */
    public final boolean getAllowRgb565() {
        return this.allowRgb565;
    }

    /* renamed from: e, reason: from getter */
    public final ColorSpace getColorSpace() {
        return this.colorSpace;
    }

    /* renamed from: f, reason: from getter */
    public final Bitmap.Config getConfig() {
        return this.config;
    }

    /* renamed from: g, reason: from getter */
    public final Context getContext() {
        return this.context;
    }

    /* renamed from: h, reason: from getter */
    public final String getDiskCacheKey() {
        return this.diskCacheKey;
    }

    public int hashCode() {
        int iHashCode = ((this.context.hashCode() * 31) + this.config.hashCode()) * 31;
        ColorSpace colorSpace = this.colorSpace;
        int iHashCode2 = (((((((((((iHashCode + (colorSpace != null ? colorSpace.hashCode() : 0)) * 31) + this.size.hashCode()) * 31) + this.scale.hashCode()) * 31) + Boolean.hashCode(this.allowInexactSize)) * 31) + Boolean.hashCode(this.allowRgb565)) * 31) + Boolean.hashCode(this.premultipliedAlpha)) * 31;
        String str = this.diskCacheKey;
        return ((((((((((((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + this.headers.hashCode()) * 31) + this.tags.hashCode()) * 31) + this.parameters.hashCode()) * 31) + this.memoryCachePolicy.hashCode()) * 31) + this.diskCachePolicy.hashCode()) * 31) + this.networkCachePolicy.hashCode();
    }

    /* renamed from: i, reason: from getter */
    public final EnumC15366b getDiskCachePolicy() {
        return this.diskCachePolicy;
    }

    /* renamed from: j, reason: from getter */
    public final Headers getHeaders() {
        return this.headers;
    }

    /* renamed from: k, reason: from getter */
    public final EnumC15366b getNetworkCachePolicy() {
        return this.networkCachePolicy;
    }

    /* renamed from: l, reason: from getter */
    public final boolean getPremultipliedAlpha() {
        return this.premultipliedAlpha;
    }

    /* renamed from: m, reason: from getter */
    public final EnumC15558h getScale() {
        return this.scale;
    }

    /* renamed from: n, reason: from getter */
    public final Size getSize() {
        return this.size;
    }

    /* renamed from: o, reason: from getter */
    public final Tags getTags() {
        return this.tags;
    }

    public C15376l(Context context, Bitmap.Config config, ColorSpace colorSpace, Size size, EnumC15558h enumC15558h, boolean z10, boolean z11, boolean z12, String str, Headers headers, Tags tags, Parameters parameters, EnumC15366b enumC15366b, EnumC15366b enumC15366b2, EnumC15366b enumC15366b3) {
        this.context = context;
        this.config = config;
        this.colorSpace = colorSpace;
        this.size = size;
        this.scale = enumC15558h;
        this.allowInexactSize = z10;
        this.allowRgb565 = z11;
        this.premultipliedAlpha = z12;
        this.diskCacheKey = str;
        this.headers = headers;
        this.tags = tags;
        this.parameters = parameters;
        this.memoryCachePolicy = enumC15366b;
        this.diskCachePolicy = enumC15366b2;
        this.networkCachePolicy = enumC15366b3;
    }
}
