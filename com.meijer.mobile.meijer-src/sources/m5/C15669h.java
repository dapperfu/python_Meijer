package m5;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import androidx.view.AbstractC6165l;
import d5.InterfaceC13626j;
import g5.i;
import java.util.List;
import java.util.Map;
import k5.InterfaceC15089c;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import m5.Parameters;
import mv.AbstractC15779K;
import n5.C15907d;
import n5.C15914k;
import n5.C15916m;
import n5.EnumC15908e;
import n5.EnumC15911h;
import n5.InterfaceC15913j;
import n5.InterfaceC15915l;
import n5.Size;
import o5.C16072b;
import o5.InterfaceC16073c;
import o5.InterfaceC16074d;
import okhttp3.Headers;
import p5.InterfaceC16405a;
import q5.C16604a;
import q5.InterfaceC16606c;
import r5.C16840d;
import r5.C16845i;
import r5.C16846j;

@Metadata(d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\bh\u0018\u00002\u00020\u0001:\u0002SOB÷\u0002\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u001c\u0010\u0016\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0015\u0018\u00010\u0013\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010$\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020\"\u0012\u0006\u0010&\u001a\u00020\"\u0012\u0006\u0010(\u001a\u00020'\u0012\u0006\u0010)\u001a\u00020'\u0012\u0006\u0010*\u001a\u00020'\u0012\u0006\u0010,\u001a\u00020+\u0012\u0006\u0010-\u001a\u00020+\u0012\u0006\u0010.\u001a\u00020+\u0012\u0006\u0010/\u001a\u00020+\u0012\u0006\u00101\u001a\u000200\u0012\u0006\u00103\u001a\u000202\u0012\u0006\u00105\u001a\u000204\u0012\u0006\u00107\u001a\u000206\u0012\b\u00108\u001a\u0004\u0018\u00010\t\u0012\b\u0010:\u001a\u0004\u0018\u000109\u0012\b\u0010<\u001a\u0004\u0018\u00010;\u0012\b\u0010=\u001a\u0004\u0018\u000109\u0012\b\u0010>\u001a\u0004\u0018\u00010;\u0012\b\u0010?\u001a\u0004\u0018\u000109\u0012\b\u0010@\u001a\u0004\u0018\u00010;\u0012\u0006\u0010B\u001a\u00020A\u0012\u0006\u0010D\u001a\u00020C¢\u0006\u0004\bE\u0010FJ\u0019\u0010H\u001a\u00020G2\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\bH\u0010IJ\u001a\u0010K\u001a\u00020\"2\b\u0010J\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\bK\u0010LJ\u000f\u0010M\u001a\u000209H\u0016¢\u0006\u0004\bM\u0010NR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR\u0017\u0010\u0004\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u0010ZR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\ba\u0010bR\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\be\u0010fR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\bg\u0010h\u001a\u0004\bi\u0010jR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\bk\u0010l\u001a\u0004\bm\u0010nR\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\bo\u0010p\u001a\u0004\bq\u0010rR-\u0010\u0016\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0015\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\bi\u0010s\u001a\u0004\bt\u0010uR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\bm\u0010v\u001a\u0004\bw\u0010xR\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0006¢\u0006\f\n\u0004\bQ\u0010y\u001a\u0004\bz\u0010{R\u0017\u0010\u001d\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\bU\u0010|\u001a\u0004\b}\u0010~R\u001a\u0010\u001f\u001a\u00020\u001e8\u0006¢\u0006\u000f\n\u0005\b\u007f\u0010\u0080\u0001\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R\u001a\u0010!\u001a\u00020 8\u0006¢\u0006\u000f\n\u0005\bw\u0010\u0083\u0001\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001R\u001a\u0010#\u001a\u00020\"8\u0006¢\u0006\u000f\n\u0006\b\u0086\u0001\u0010\u0087\u0001\u001a\u0005\bg\u0010\u0088\u0001R\u001a\u0010$\u001a\u00020\"8\u0006¢\u0006\u000f\n\u0006\b\u0089\u0001\u0010\u0087\u0001\u001a\u0005\bk\u0010\u0088\u0001R\u0019\u0010%\u001a\u00020\"8\u0006¢\u0006\u000e\n\u0005\be\u0010\u0087\u0001\u001a\u0005\bo\u0010\u0088\u0001R\u001b\u0010&\u001a\u00020\"8\u0006¢\u0006\u0010\n\u0006\b\u008a\u0001\u0010\u0087\u0001\u001a\u0006\b\u008b\u0001\u0010\u0088\u0001R\u001b\u0010(\u001a\u00020'8\u0006¢\u0006\u0010\n\u0006\b\u008c\u0001\u0010\u008d\u0001\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001R\u001b\u0010)\u001a\u00020'8\u0006¢\u0006\u0010\n\u0006\b\u0090\u0001\u0010\u008d\u0001\u001a\u0006\b\u008a\u0001\u0010\u008f\u0001R\u001b\u0010*\u001a\u00020'8\u0006¢\u0006\u0010\n\u0006\b\u0091\u0001\u0010\u008d\u0001\u001a\u0006\b\u0092\u0001\u0010\u008f\u0001R\u001a\u0010,\u001a\u00020+8\u0006¢\u0006\u000f\n\u0005\bt\u0010\u0093\u0001\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001R\u001b\u0010-\u001a\u00020+8\u0006¢\u0006\u0010\n\u0006\b\u0081\u0001\u0010\u0093\u0001\u001a\u0006\b\u0091\u0001\u0010\u0095\u0001R\u001a\u0010.\u001a\u00020+8\u0006¢\u0006\u000f\n\u0006\b\u0094\u0001\u0010\u0093\u0001\u001a\u0005\b\u007f\u0010\u0095\u0001R\u001b\u0010/\u001a\u00020+8\u0006¢\u0006\u0010\n\u0006\b\u0096\u0001\u0010\u0093\u0001\u001a\u0006\b\u0097\u0001\u0010\u0095\u0001R\u001a\u00101\u001a\u0002008\u0006¢\u0006\u000f\n\u0005\b]\u0010\u0098\u0001\u001a\u0006\b\u0096\u0001\u0010\u0099\u0001R\u001a\u00103\u001a\u0002028\u0006¢\u0006\u000f\n\u0005\ba\u0010\u009a\u0001\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001R\u001b\u00105\u001a\u0002048\u0006¢\u0006\u0010\n\u0006\b\u008e\u0001\u0010\u009d\u0001\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001R\u001b\u00107\u001a\u0002068\u0006¢\u0006\u0010\n\u0006\b\u0092\u0001\u0010 \u0001\u001a\u0006\b¡\u0001\u0010¢\u0001R\u001b\u00108\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\u000e\n\u0005\b¡\u0001\u0010`\u001a\u0005\b£\u0001\u0010bR\u0018\u0010:\u001a\u0004\u0018\u0001098\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¤\u0001\u0010¥\u0001R\u0018\u0010<\u001a\u0004\u0018\u00010;8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b£\u0001\u0010¦\u0001R\u0017\u0010=\u001a\u0004\u0018\u0001098\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bq\u0010¥\u0001R\u0018\u0010>\u001a\u0004\u0018\u00010;8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008b\u0001\u0010¦\u0001R\u0018\u0010?\u001a\u0004\u0018\u0001098\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009e\u0001\u0010¥\u0001R\u0018\u0010@\u001a\u0004\u0018\u00010;8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009b\u0001\u0010¦\u0001R\u001b\u0010B\u001a\u00020A8\u0006¢\u0006\u0010\n\u0006\b\u0084\u0001\u0010§\u0001\u001a\u0006\b\u0089\u0001\u0010¨\u0001R\u001a\u0010D\u001a\u00020C8\u0006¢\u0006\u000f\n\u0005\bY\u0010©\u0001\u001a\u0006\b\u0086\u0001\u0010ª\u0001R\u0016\u0010¬\u0001\u001a\u0004\u0018\u00010;8F¢\u0006\b\u001a\u0006\b¤\u0001\u0010«\u0001R\u0016\u0010\u00ad\u0001\u001a\u0004\u0018\u00010;8F¢\u0006\b\u001a\u0006\b\u008c\u0001\u0010«\u0001R\u0016\u0010®\u0001\u001a\u0004\u0018\u00010;8F¢\u0006\b\u001a\u0006\b\u0090\u0001\u0010«\u0001¨\u0006¯\u0001"}, d2 = {"Lm5/h;", "", "Landroid/content/Context;", "context", "data", "Lo5/c;", "target", "Lm5/h$b;", "listener", "Lk5/c$b;", "memoryCacheKey", "", "diskCacheKey", "Landroid/graphics/Bitmap$Config;", "bitmapConfig", "Landroid/graphics/ColorSpace;", "colorSpace", "Ln5/e;", "precision", "Lkotlin/Pair;", "Lg5/i$a;", "Ljava/lang/Class;", "fetcherFactory", "Ld5/j$a;", "decoderFactory", "", "Lp5/a;", "transformations", "Lq5/c$a;", "transitionFactory", "Lokhttp3/Headers;", "headers", "Lm5/q;", "tags", "", "allowConversionToBitmap", "allowHardware", "allowRgb565", "premultipliedAlpha", "Lm5/b;", "memoryCachePolicy", "diskCachePolicy", "networkCachePolicy", "Lmv/K;", "interceptorDispatcher", "fetcherDispatcher", "decoderDispatcher", "transformationDispatcher", "Landroidx/lifecycle/l;", "lifecycle", "Ln5/j;", "sizeResolver", "Ln5/h;", "scale", "Lm5/m;", "parameters", "placeholderMemoryCacheKey", "", "placeholderResId", "Landroid/graphics/drawable/Drawable;", "placeholderDrawable", "errorResId", "errorDrawable", "fallbackResId", "fallbackDrawable", "Lm5/d;", "defined", "Lm5/c;", "defaults", "<init>", "(Landroid/content/Context;Ljava/lang/Object;Lo5/c;Lm5/h$b;Lk5/c$b;Ljava/lang/String;Landroid/graphics/Bitmap$Config;Landroid/graphics/ColorSpace;Ln5/e;Lkotlin/Pair;Ld5/j$a;Ljava/util/List;Lq5/c$a;Lokhttp3/Headers;Lm5/q;ZZZZLm5/b;Lm5/b;Lm5/b;Lmv/K;Lmv/K;Lmv/K;Lmv/K;Landroidx/lifecycle/l;Ln5/j;Ln5/h;Lm5/m;Lk5/c$b;Ljava/lang/Integer;Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;Landroid/graphics/drawable/Drawable;Lm5/d;Lm5/c;)V", "Lm5/h$a;", "Q", "(Landroid/content/Context;)Lm5/h$a;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "a", "Landroid/content/Context;", "l", "()Landroid/content/Context;", "b", "Ljava/lang/Object;", "m", "()Ljava/lang/Object;", "c", "Lo5/c;", "M", "()Lo5/c;", "d", "Lm5/h$b;", "A", "()Lm5/h$b;", "e", "Lk5/c$b;", "B", "()Lk5/c$b;", "f", "Ljava/lang/String;", "r", "()Ljava/lang/String;", "g", "Landroid/graphics/Bitmap$Config;", "j", "()Landroid/graphics/Bitmap$Config;", "h", "Landroid/graphics/ColorSpace;", "k", "()Landroid/graphics/ColorSpace;", "i", "Ln5/e;", "H", "()Ln5/e;", "Lkotlin/Pair;", "w", "()Lkotlin/Pair;", "Ld5/j$a;", "o", "()Ld5/j$a;", "Ljava/util/List;", "O", "()Ljava/util/List;", "Lq5/c$a;", "P", "()Lq5/c$a;", "n", "Lokhttp3/Headers;", "x", "()Lokhttp3/Headers;", "Lm5/q;", "L", "()Lm5/q;", "p", "Z", "()Z", "q", "s", "I", "t", "Lm5/b;", "C", "()Lm5/b;", "u", "v", "D", "Lmv/K;", "y", "()Lmv/K;", "z", "N", "Landroidx/lifecycle/l;", "()Landroidx/lifecycle/l;", "Ln5/j;", "K", "()Ln5/j;", "Ln5/h;", "J", "()Ln5/h;", "Lm5/m;", "E", "()Lm5/m;", "G", "F", "Ljava/lang/Integer;", "Landroid/graphics/drawable/Drawable;", "Lm5/d;", "()Lm5/d;", "Lm5/c;", "()Lm5/c;", "()Landroid/graphics/drawable/Drawable;", "placeholder", "error", "fallback", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: m5.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C15669h {

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    private final AbstractC6165l lifecycle;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC15913j sizeResolver;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private final EnumC15911h scale;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private final Parameters parameters;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC15089c.Key placeholderMemoryCacheKey;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private final Integer placeholderResId;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    private final Drawable placeholderDrawable;

    /* renamed from: H, reason: collision with root package name and from kotlin metadata */
    private final Integer errorResId;

    /* renamed from: I, reason: collision with root package name and from kotlin metadata */
    private final Drawable errorDrawable;

    /* renamed from: J, reason: collision with root package name and from kotlin metadata */
    private final Integer fallbackResId;

    /* renamed from: K, reason: collision with root package name and from kotlin metadata */
    private final Drawable fallbackDrawable;

    /* renamed from: L, reason: collision with root package name and from kotlin metadata */
    private final C15665d defined;

    /* renamed from: M, reason: collision with root package name and from kotlin metadata */
    private final C15664c defaults;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Object data;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16073c target;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final b listener;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC15089c.Key memoryCacheKey;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final String diskCacheKey;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Bitmap.Config bitmapConfig;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final ColorSpace colorSpace;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final EnumC15908e precision;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final Pair<i.a<?>, Class<?>> fetcherFactory;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC13626j.a decoderFactory;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final List<InterfaceC16405a> transformations;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16606c.a transitionFactory;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Headers headers;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final Tags tags;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final boolean allowConversionToBitmap;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final boolean allowHardware;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final boolean allowRgb565;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final boolean premultipliedAlpha;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final EnumC15663b memoryCachePolicy;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final EnumC15663b diskCachePolicy;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final EnumC15663b networkCachePolicy;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final AbstractC15779K interceptorDispatcher;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final AbstractC15779K fetcherDispatcher;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final AbstractC15779K decoderDispatcher;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final AbstractC15779K transformationDispatcher;

    @Metadata(d1 = {"\u0000ô\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001a\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00002\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00002\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00002\b\u0010\u001a\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00002\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b \u0010\u001cJ\u0017\u0010#\u001a\u00020\u00002\b\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b#\u0010$J\u0015\u0010'\u001a\u00020\u00002\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J\u0015\u0010*\u001a\u00020\u00002\u0006\u0010)\u001a\u00020\u0010¢\u0006\u0004\b*\u0010+J\u0015\u0010-\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u0013¢\u0006\u0004\b-\u0010.J\u0015\u00101\u001a\u00020\u00002\u0006\u00100\u001a\u00020/¢\u0006\u0004\b1\u00102J\u0015\u00105\u001a\u00020\u00002\u0006\u00104\u001a\u000203¢\u0006\u0004\b5\u00106J\u0015\u00109\u001a\u00020\u00002\u0006\u00108\u001a\u000207¢\u0006\u0004\b9\u0010:J\u0015\u0010;\u001a\u00020\u00002\u0006\u00108\u001a\u000207¢\u0006\u0004\b;\u0010:J\u001d\u0010>\u001a\u00020\u00002\u0006\u0010<\u001a\u00020\u00192\u0006\u0010=\u001a\u00020\u0019¢\u0006\u0004\b>\u0010?J\u0017\u0010@\u001a\u00020\u00002\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b@\u0010\u001cJ\u0017\u0010A\u001a\u00020\u00002\b\u0010\u001a\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\bA\u0010\u001fJ\u0017\u0010D\u001a\u00020\u00002\b\b\u0001\u0010C\u001a\u00020B¢\u0006\u0004\bD\u0010EJ\u0017\u0010F\u001a\u00020\u00002\b\b\u0001\u0010C\u001a\u00020B¢\u0006\u0004\bF\u0010EJ\u0017\u0010G\u001a\u00020\u00002\b\b\u0001\u0010C\u001a\u00020B¢\u0006\u0004\bG\u0010EJ\u0015\u0010J\u001a\u00020\u00002\u0006\u0010I\u001a\u00020H¢\u0006\u0004\bJ\u0010KJ\u0017\u0010N\u001a\u00020\u00002\b\u0010M\u001a\u0004\u0018\u00010L¢\u0006\u0004\bN\u0010OJ\u0015\u0010P\u001a\u00020\u00002\u0006\u00104\u001a\u000203¢\u0006\u0004\bP\u00106J\u0015\u0010R\u001a\u00020\u00002\u0006\u0010Q\u001a\u00020B¢\u0006\u0004\bR\u0010EJ\u0015\u0010U\u001a\u00020\u00002\u0006\u0010T\u001a\u00020S¢\u0006\u0004\bU\u0010VJ\u0015\u0010Y\u001a\u00020\u00002\u0006\u0010X\u001a\u00020W¢\u0006\u0004\bY\u0010ZJ\r\u0010[\u001a\u00020\u0006¢\u0006\u0004\b[\u0010\\R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010]R\u0016\u0010X\u001a\u00020W8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010^R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010_R\u0018\u0010M\u001a\u0004\u0018\u00010L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010`R\u0018\u0010\"\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010aR\u0018\u0010c\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010bR\u0018\u0010e\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010dR\u0018\u0010h\u001a\u0004\u0018\u00010f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010gR\u0018\u0010k\u001a\u0004\u0018\u00010i8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010jR\u0018\u00100\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010lR,\u0010q\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030n\u0012\b\u0012\u0006\u0012\u0002\b\u00030o\u0018\u00010m8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010pR\u0018\u0010t\u001a\u0004\u0018\u00010r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010sR\u001c\u0010x\u001a\b\u0012\u0004\u0012\u00020v0u8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010wR\u0018\u0010z\u001a\u0004\u0018\u00010S8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010yR\u0018\u0010}\u001a\u0004\u0018\u00010{8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010|R)\u0010\u0080\u0001\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030o\u0012\u0004\u0012\u00020\u0001\u0018\u00010~8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010\u007fR\u0018\u0010\u0082\u0001\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b@\u0010\u0081\u0001R\u001a\u0010\u0084\u0001\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bA\u0010\u0083\u0001R\u001a\u0010\u0085\u0001\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b1\u0010\u0083\u0001R\u0018\u0010\u0086\u0001\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\f\u0010\u0081\u0001R\u001a\u0010\u0088\u0001\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\n\u0010\u0087\u0001R\u001a\u0010\u0089\u0001\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u000e\u0010\u0087\u0001R\u001a\u0010\u008a\u0001\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0014\u0010\u0087\u0001R\u001b\u0010\u008d\u0001\u001a\u0005\u0018\u00010\u008b\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0011\u0010\u008c\u0001R\u001b\u0010\u008e\u0001\u001a\u0005\u0018\u00010\u008b\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b-\u0010\u008c\u0001R\u001b\u0010\u008f\u0001\u001a\u0005\u0018\u00010\u008b\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b'\u0010\u008c\u0001R\u001b\u0010\u0090\u0001\u001a\u0005\u0018\u00010\u008b\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b*\u0010\u008c\u0001R\u001b\u0010\u0093\u0001\u001a\u0005\u0018\u00010\u0091\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bJ\u0010\u0092\u0001R\u0019\u0010\u0094\u0001\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010bR\u001a\u0010\u0096\u0001\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\bU\u0010\u0095\u0001R\u001c\u0010\u009a\u0001\u001a\u0005\u0018\u00010\u0097\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0099\u0001R\u001b\u0010\u009c\u0001\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u0095\u0001R\u001c\u0010\u009e\u0001\u001a\u0005\u0018\u00010\u0097\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u0099\u0001R\u001b\u0010 \u0001\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b\u009f\u0001\u0010\u0095\u0001R\u001c\u0010¢\u0001\u001a\u0005\u0018\u00010\u0097\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¡\u0001\u0010\u0099\u0001R\u001b\u0010¥\u0001\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b£\u0001\u0010¤\u0001R\u001b\u0010¨\u0001\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¦\u0001\u0010§\u0001R\u001a\u0010,\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b©\u0001\u0010ª\u0001R\u001b\u0010¬\u0001\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b«\u0001\u0010¤\u0001R\u001b\u0010®\u0001\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u00ad\u0001\u0010§\u0001R\u001b\u0010°\u0001\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¯\u0001\u0010ª\u0001¨\u0006±\u0001"}, d2 = {"Lm5/h$a;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lm5/h;", "request", "(Lm5/h;Landroid/content/Context;)V", "", "u", "()V", "t", "Landroidx/lifecycle/l;", "v", "()Landroidx/lifecycle/l;", "Ln5/j;", "x", "()Ln5/j;", "Ln5/h;", "w", "()Ln5/h;", "data", "f", "(Ljava/lang/Object;)Lm5/h$a;", "", "key", "m", "(Ljava/lang/String;)Lm5/h$a;", "Lk5/c$b;", "n", "(Lk5/c$b;)Lm5/h$a;", "h", "Lm5/h$b;", "listener", "l", "(Lm5/h$b;)Lm5/h$a;", "Ln5/i;", "size", "z", "(Ln5/i;)Lm5/h$a;", "resolver", "A", "(Ln5/j;)Lm5/h$a;", "scale", "y", "(Ln5/h;)Lm5/h$a;", "Ln5/e;", "precision", "s", "(Ln5/e;)Lm5/h$a;", "", "enable", "b", "(Z)Lm5/h$a;", "Lm5/b;", "policy", "o", "(Lm5/b;)Lm5/h$a;", "i", "name", "value", "a", "(Ljava/lang/String;Ljava/lang/String;)Lm5/h$a;", "q", "r", "", "drawableResId", "p", "(I)Lm5/h$a;", "j", "k", "Landroid/widget/ImageView;", "imageView", "B", "(Landroid/widget/ImageView;)Lm5/h$a;", "Lo5/c;", "target", "C", "(Lo5/c;)Lm5/h$a;", "e", "durationMillis", "d", "Lq5/c$a;", "transition", "D", "(Lq5/c$a;)Lm5/h$a;", "Lm5/c;", "defaults", "g", "(Lm5/c;)Lm5/h$a;", "c", "()Lm5/h;", "Landroid/content/Context;", "Lm5/c;", "Ljava/lang/Object;", "Lo5/c;", "Lm5/h$b;", "Lk5/c$b;", "memoryCacheKey", "Ljava/lang/String;", "diskCacheKey", "Landroid/graphics/Bitmap$Config;", "Landroid/graphics/Bitmap$Config;", "bitmapConfig", "Landroid/graphics/ColorSpace;", "Landroid/graphics/ColorSpace;", "colorSpace", "Ln5/e;", "Lkotlin/Pair;", "Lg5/i$a;", "Ljava/lang/Class;", "Lkotlin/Pair;", "fetcherFactory", "Ld5/j$a;", "Ld5/j$a;", "decoderFactory", "", "Lp5/a;", "Ljava/util/List;", "transformations", "Lq5/c$a;", "transitionFactory", "Lokhttp3/Headers$a;", "Lokhttp3/Headers$a;", "headers", "", "Ljava/util/Map;", "tags", "Z", "allowConversionToBitmap", "Ljava/lang/Boolean;", "allowHardware", "allowRgb565", "premultipliedAlpha", "Lm5/b;", "memoryCachePolicy", "diskCachePolicy", "networkCachePolicy", "Lmv/K;", "Lmv/K;", "interceptorDispatcher", "fetcherDispatcher", "decoderDispatcher", "transformationDispatcher", "Lm5/m$a;", "Lm5/m$a;", "parameters", "placeholderMemoryCacheKey", "Ljava/lang/Integer;", "placeholderResId", "Landroid/graphics/drawable/Drawable;", "E", "Landroid/graphics/drawable/Drawable;", "placeholderDrawable", "F", "errorResId", "G", "errorDrawable", "H", "fallbackResId", "I", "fallbackDrawable", "J", "Landroidx/lifecycle/l;", "lifecycle", "K", "Ln5/j;", "sizeResolver", "L", "Ln5/h;", "M", "resolvedLifecycle", "N", "resolvedSizeResolver", "O", "resolvedScale", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: m5.h$a */
    public static final class a {

        /* renamed from: A, reason: collision with root package name and from kotlin metadata */
        private AbstractC15779K transformationDispatcher;

        /* renamed from: B, reason: collision with root package name and from kotlin metadata */
        private Parameters.a parameters;

        /* renamed from: C, reason: collision with root package name and from kotlin metadata */
        private InterfaceC15089c.Key placeholderMemoryCacheKey;

        /* renamed from: D, reason: collision with root package name and from kotlin metadata */
        private Integer placeholderResId;

        /* renamed from: E, reason: collision with root package name and from kotlin metadata */
        private Drawable placeholderDrawable;

        /* renamed from: F, reason: collision with root package name and from kotlin metadata */
        private Integer errorResId;

        /* renamed from: G, reason: collision with root package name and from kotlin metadata */
        private Drawable errorDrawable;

        /* renamed from: H, reason: collision with root package name and from kotlin metadata */
        private Integer fallbackResId;

        /* renamed from: I, reason: collision with root package name and from kotlin metadata */
        private Drawable fallbackDrawable;

        /* renamed from: J, reason: collision with root package name and from kotlin metadata */
        private AbstractC6165l lifecycle;

        /* renamed from: K, reason: collision with root package name and from kotlin metadata */
        private InterfaceC15913j sizeResolver;

        /* renamed from: L, reason: collision with root package name and from kotlin metadata */
        private EnumC15911h scale;

        /* renamed from: M, reason: collision with root package name and from kotlin metadata */
        private AbstractC6165l resolvedLifecycle;

        /* renamed from: N, reason: collision with root package name and from kotlin metadata */
        private InterfaceC15913j resolvedSizeResolver;

        /* renamed from: O, reason: collision with root package name and from kotlin metadata */
        private EnumC15911h resolvedScale;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Context context;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private C15664c defaults;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private Object data;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private InterfaceC16073c target;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private b listener;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private InterfaceC15089c.Key memoryCacheKey;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private String diskCacheKey;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        private Bitmap.Config bitmapConfig;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        private ColorSpace colorSpace;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata */
        private EnumC15908e precision;

        /* renamed from: k, reason: collision with root package name and from kotlin metadata */
        private Pair<? extends i.a<?>, ? extends Class<?>> fetcherFactory;

        /* renamed from: l, reason: collision with root package name and from kotlin metadata */
        private InterfaceC13626j.a decoderFactory;

        /* renamed from: m, reason: collision with root package name and from kotlin metadata */
        private List<? extends InterfaceC16405a> transformations;

        /* renamed from: n, reason: collision with root package name and from kotlin metadata */
        private InterfaceC16606c.a transitionFactory;

        /* renamed from: o, reason: collision with root package name and from kotlin metadata */
        private Headers.a headers;

        /* renamed from: p, reason: collision with root package name and from kotlin metadata */
        private Map<Class<?>, Object> tags;

        /* renamed from: q, reason: collision with root package name and from kotlin metadata */
        private boolean allowConversionToBitmap;

        /* renamed from: r, reason: collision with root package name and from kotlin metadata */
        private Boolean allowHardware;

        /* renamed from: s, reason: collision with root package name and from kotlin metadata */
        private Boolean allowRgb565;

        /* renamed from: t, reason: collision with root package name and from kotlin metadata */
        private boolean premultipliedAlpha;

        /* renamed from: u, reason: collision with root package name and from kotlin metadata */
        private EnumC15663b memoryCachePolicy;

        /* renamed from: v, reason: collision with root package name and from kotlin metadata */
        private EnumC15663b diskCachePolicy;

        /* renamed from: w, reason: collision with root package name and from kotlin metadata */
        private EnumC15663b networkCachePolicy;

        /* renamed from: x, reason: collision with root package name and from kotlin metadata */
        private AbstractC15779K interceptorDispatcher;

        /* renamed from: y, reason: collision with root package name and from kotlin metadata */
        private AbstractC15779K fetcherDispatcher;

        /* renamed from: z, reason: collision with root package name and from kotlin metadata */
        private AbstractC15779K decoderDispatcher;

        public a(Context context) {
            this.context = context;
            this.defaults = C16845i.b();
            this.data = null;
            this.target = null;
            this.listener = null;
            this.memoryCacheKey = null;
            this.diskCacheKey = null;
            this.bitmapConfig = null;
            if (Build.VERSION.SDK_INT >= 26) {
                this.colorSpace = null;
            }
            this.precision = null;
            this.fetcherFactory = null;
            this.decoderFactory = null;
            this.transformations = CollectionsKt.m();
            this.transitionFactory = null;
            this.headers = null;
            this.tags = null;
            this.allowConversionToBitmap = true;
            this.allowHardware = null;
            this.allowRgb565 = null;
            this.premultipliedAlpha = true;
            this.memoryCachePolicy = null;
            this.diskCachePolicy = null;
            this.networkCachePolicy = null;
            this.interceptorDispatcher = null;
            this.fetcherDispatcher = null;
            this.decoderDispatcher = null;
            this.transformationDispatcher = null;
            this.parameters = null;
            this.placeholderMemoryCacheKey = null;
            this.placeholderResId = null;
            this.placeholderDrawable = null;
            this.errorResId = null;
            this.errorDrawable = null;
            this.fallbackResId = null;
            this.fallbackDrawable = null;
            this.lifecycle = null;
            this.sizeResolver = null;
            this.scale = null;
            this.resolvedLifecycle = null;
            this.resolvedSizeResolver = null;
            this.resolvedScale = null;
        }

        private final void t() {
            this.resolvedScale = null;
        }

        private final void u() {
            this.resolvedLifecycle = null;
            this.resolvedSizeResolver = null;
            this.resolvedScale = null;
        }

        public final a m(String key) {
            return n(key != null ? new InterfaceC15089c.Key(key, null, 2, null) : null);
        }

        public final a q(String key) {
            return r(key != null ? new InterfaceC15089c.Key(key, null, 2, null) : null);
        }

        private final AbstractC6165l v() {
            InterfaceC16073c interfaceC16073c = this.target;
            AbstractC6165l abstractC6165lC = C16840d.c(interfaceC16073c instanceof InterfaceC16074d ? ((InterfaceC16074d) interfaceC16073c).getView().getContext() : this.context);
            return abstractC6165lC == null ? C15668g.f150621b : abstractC6165lC;
        }

        private final EnumC15911h w() {
            View view;
            InterfaceC15913j interfaceC15913j = this.sizeResolver;
            View view2 = null;
            InterfaceC15915l interfaceC15915l = interfaceC15913j instanceof InterfaceC15915l ? (InterfaceC15915l) interfaceC15913j : null;
            if (interfaceC15915l == null || (view = interfaceC15915l.getView()) == null) {
                InterfaceC16073c interfaceC16073c = this.target;
                InterfaceC16074d interfaceC16074d = interfaceC16073c instanceof InterfaceC16074d ? (InterfaceC16074d) interfaceC16073c : null;
                if (interfaceC16074d != null) {
                    view2 = interfaceC16074d.getView();
                }
            } else {
                view2 = view;
            }
            return view2 instanceof ImageView ? C16846j.o((ImageView) view2) : EnumC15911h.f152060b;
        }

        private final InterfaceC15913j x() {
            ImageView.ScaleType scaleType;
            InterfaceC16073c interfaceC16073c = this.target;
            if (!(interfaceC16073c instanceof InterfaceC16074d)) {
                return new C15907d(this.context);
            }
            View view = ((InterfaceC16074d) interfaceC16073c).getView();
            return ((view instanceof ImageView) && ((scaleType = ((ImageView) view).getScaleType()) == ImageView.ScaleType.CENTER || scaleType == ImageView.ScaleType.MATRIX)) ? C15914k.a(Size.f152064d) : C15916m.b(view, false, 2, null);
        }

        public final a A(InterfaceC15913j resolver) {
            this.sizeResolver = resolver;
            u();
            return this;
        }

        public final a B(ImageView imageView) {
            return C(new C16072b(imageView));
        }

        public final a C(InterfaceC16073c target) {
            this.target = target;
            u();
            return this;
        }

        public final a D(InterfaceC16606c.a transition) {
            this.transitionFactory = transition;
            return this;
        }

        public final a a(String name, String value) {
            Headers.a aVar = this.headers;
            if (aVar == null) {
                aVar = new Headers.a();
                this.headers = aVar;
            }
            aVar.a(name, value);
            return this;
        }

        public final C15669h c() {
            Context context = this.context;
            Object obj = this.data;
            if (obj == null) {
                obj = C15671j.f150703a;
            }
            Object obj2 = obj;
            InterfaceC16073c interfaceC16073c = this.target;
            b bVar = this.listener;
            InterfaceC15089c.Key key = this.memoryCacheKey;
            String str = this.diskCacheKey;
            Bitmap.Config configE = this.bitmapConfig;
            if (configE == null) {
                configE = this.defaults.getBitmapConfig();
            }
            Bitmap.Config config = configE;
            ColorSpace colorSpace = this.colorSpace;
            EnumC15908e enumC15908eO = this.precision;
            if (enumC15908eO == null) {
                enumC15908eO = this.defaults.getPrecision();
            }
            EnumC15908e enumC15908e = enumC15908eO;
            Pair<? extends i.a<?>, ? extends Class<?>> pair = this.fetcherFactory;
            InterfaceC13626j.a aVar = this.decoderFactory;
            List<? extends InterfaceC16405a> list = this.transformations;
            InterfaceC16606c.a aVarQ = this.transitionFactory;
            if (aVarQ == null) {
                aVarQ = this.defaults.getTransitionFactory();
            }
            InterfaceC16606c.a aVar2 = aVarQ;
            Headers.a aVar3 = this.headers;
            Headers headersY = C16846j.y(aVar3 != null ? aVar3.f() : null);
            Map<Class<?>, ? extends Object> map = this.tags;
            Tags tagsX = C16846j.x(map != null ? Tags.INSTANCE.a(map) : null);
            boolean z10 = this.allowConversionToBitmap;
            Boolean bool = this.allowHardware;
            boolean zBooleanValue = bool != null ? bool.booleanValue() : this.defaults.getAllowHardware();
            Boolean bool2 = this.allowRgb565;
            boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : this.defaults.getAllowRgb565();
            boolean z11 = this.premultipliedAlpha;
            EnumC15663b enumC15663bL = this.memoryCachePolicy;
            if (enumC15663bL == null) {
                enumC15663bL = this.defaults.getMemoryCachePolicy();
            }
            EnumC15663b enumC15663b = enumC15663bL;
            EnumC15663b enumC15663bG = this.diskCachePolicy;
            if (enumC15663bG == null) {
                enumC15663bG = this.defaults.getDiskCachePolicy();
            }
            EnumC15663b enumC15663b2 = enumC15663bG;
            EnumC15663b enumC15663bM = this.networkCachePolicy;
            if (enumC15663bM == null) {
                enumC15663bM = this.defaults.getNetworkCachePolicy();
            }
            EnumC15663b enumC15663b3 = enumC15663bM;
            AbstractC15779K abstractC15779KK = this.interceptorDispatcher;
            if (abstractC15779KK == null) {
                abstractC15779KK = this.defaults.getInterceptorDispatcher();
            }
            AbstractC15779K abstractC15779K = abstractC15779KK;
            AbstractC15779K abstractC15779KJ = this.fetcherDispatcher;
            if (abstractC15779KJ == null) {
                abstractC15779KJ = this.defaults.getFetcherDispatcher();
            }
            AbstractC15779K abstractC15779K2 = abstractC15779KJ;
            AbstractC15779K abstractC15779KF = this.decoderDispatcher;
            if (abstractC15779KF == null) {
                abstractC15779KF = this.defaults.getDecoderDispatcher();
            }
            AbstractC15779K abstractC15779K3 = abstractC15779KF;
            AbstractC15779K abstractC15779KP = this.transformationDispatcher;
            if (abstractC15779KP == null) {
                abstractC15779KP = this.defaults.getTransformationDispatcher();
            }
            AbstractC15779K abstractC15779K4 = abstractC15779KP;
            AbstractC6165l abstractC6165lV = this.lifecycle;
            if (abstractC6165lV == null && (abstractC6165lV = this.resolvedLifecycle) == null) {
                abstractC6165lV = v();
            }
            AbstractC6165l abstractC6165l = abstractC6165lV;
            InterfaceC15913j interfaceC15913jX = this.sizeResolver;
            if (interfaceC15913jX == null && (interfaceC15913jX = this.resolvedSizeResolver) == null) {
                interfaceC15913jX = x();
            }
            InterfaceC15913j interfaceC15913j = interfaceC15913jX;
            EnumC15911h enumC15911hW = this.scale;
            if (enumC15911hW == null && (enumC15911hW = this.resolvedScale) == null) {
                enumC15911hW = w();
            }
            EnumC15911h enumC15911h = enumC15911hW;
            Parameters.a aVar4 = this.parameters;
            return new C15669h(context, obj2, interfaceC16073c, bVar, key, str, config, colorSpace, enumC15908e, pair, aVar, list, aVar2, headersY, tagsX, z10, zBooleanValue, zBooleanValue2, z11, enumC15663b, enumC15663b2, enumC15663b3, abstractC15779K, abstractC15779K2, abstractC15779K3, abstractC15779K4, abstractC6165l, interfaceC15913j, enumC15911h, C16846j.w(aVar4 != null ? aVar4.a() : null), this.placeholderMemoryCacheKey, this.placeholderResId, this.placeholderDrawable, this.errorResId, this.errorDrawable, this.fallbackResId, this.fallbackDrawable, new C15665d(this.lifecycle, this.sizeResolver, this.scale, this.interceptorDispatcher, this.fetcherDispatcher, this.decoderDispatcher, this.transformationDispatcher, this.transitionFactory, this.precision, this.bitmapConfig, this.allowHardware, this.allowRgb565, this.memoryCachePolicy, this.diskCachePolicy, this.networkCachePolicy), this.defaults, null);
        }

        public final a d(int durationMillis) {
            InterfaceC16606c.a c2453a;
            if (durationMillis > 0) {
                c2453a = new C16604a.C2453a(durationMillis, false, 2, null);
            } else {
                c2453a = InterfaceC16606c.a.f157901b;
            }
            D(c2453a);
            return this;
        }

        public final a e(boolean enable) {
            return d(enable ? 100 : 0);
        }

        public final a f(Object data) {
            this.data = data;
            return this;
        }

        public final a g(C15664c defaults) {
            this.defaults = defaults;
            t();
            return this;
        }

        public final a h(String key) {
            this.diskCacheKey = key;
            return this;
        }

        public final a i(EnumC15663b policy) {
            this.diskCachePolicy = policy;
            return this;
        }

        public final a l(b listener) {
            this.listener = listener;
            return this;
        }

        public final a n(InterfaceC15089c.Key key) {
            this.memoryCacheKey = key;
            return this;
        }

        public final a o(EnumC15663b policy) {
            this.memoryCachePolicy = policy;
            return this;
        }

        public final a r(InterfaceC15089c.Key key) {
            this.placeholderMemoryCacheKey = key;
            return this;
        }

        public final a s(EnumC15908e precision) {
            this.precision = precision;
            return this;
        }

        public final a y(EnumC15911h scale) {
            this.scale = scale;
            return this;
        }

        public final a b(boolean enable) {
            this.allowHardware = Boolean.valueOf(enable);
            return this;
        }

        public final a j(int drawableResId) {
            this.errorResId = Integer.valueOf(drawableResId);
            this.errorDrawable = null;
            return this;
        }

        public final a k(int drawableResId) {
            this.fallbackResId = Integer.valueOf(drawableResId);
            this.fallbackDrawable = null;
            return this;
        }

        public final a p(int drawableResId) {
            this.placeholderResId = Integer.valueOf(drawableResId);
            this.placeholderDrawable = null;
            return this;
        }

        public final a z(Size size) {
            return A(C15914k.a(size));
        }

        @JvmOverloads
        public a(C15669h c15669h, Context context) {
            this.context = context;
            this.defaults = c15669h.getDefaults();
            this.data = c15669h.getData();
            this.target = c15669h.getTarget();
            this.listener = c15669h.getListener();
            this.memoryCacheKey = c15669h.getMemoryCacheKey();
            this.diskCacheKey = c15669h.getDiskCacheKey();
            this.bitmapConfig = c15669h.getDefined().getBitmapConfig();
            if (Build.VERSION.SDK_INT >= 26) {
                this.colorSpace = c15669h.getColorSpace();
            }
            this.precision = c15669h.getDefined().getPrecision();
            this.fetcherFactory = c15669h.w();
            this.decoderFactory = c15669h.getDecoderFactory();
            this.transformations = c15669h.O();
            this.transitionFactory = c15669h.getDefined().getTransitionFactory();
            this.headers = c15669h.getHeaders().k();
            this.tags = MapsKt.D(c15669h.getTags().a());
            this.allowConversionToBitmap = c15669h.getAllowConversionToBitmap();
            this.allowHardware = c15669h.getDefined().getAllowHardware();
            this.allowRgb565 = c15669h.getDefined().getAllowRgb565();
            this.premultipliedAlpha = c15669h.getPremultipliedAlpha();
            this.memoryCachePolicy = c15669h.getDefined().getMemoryCachePolicy();
            this.diskCachePolicy = c15669h.getDefined().getDiskCachePolicy();
            this.networkCachePolicy = c15669h.getDefined().getNetworkCachePolicy();
            this.interceptorDispatcher = c15669h.getDefined().getInterceptorDispatcher();
            this.fetcherDispatcher = c15669h.getDefined().getFetcherDispatcher();
            this.decoderDispatcher = c15669h.getDefined().getDecoderDispatcher();
            this.transformationDispatcher = c15669h.getDefined().getTransformationDispatcher();
            this.parameters = c15669h.getParameters().h();
            this.placeholderMemoryCacheKey = c15669h.getPlaceholderMemoryCacheKey();
            this.placeholderResId = c15669h.placeholderResId;
            this.placeholderDrawable = c15669h.placeholderDrawable;
            this.errorResId = c15669h.errorResId;
            this.errorDrawable = c15669h.errorDrawable;
            this.fallbackResId = c15669h.fallbackResId;
            this.fallbackDrawable = c15669h.fallbackDrawable;
            this.lifecycle = c15669h.getDefined().getLifecycle();
            this.sizeResolver = c15669h.getDefined().getSizeResolver();
            this.scale = c15669h.getDefined().getScale();
            if (c15669h.getContext() == context) {
                this.resolvedLifecycle = c15669h.getLifecycle();
                this.resolvedSizeResolver = c15669h.getSizeResolver();
                this.resolvedScale = c15669h.getScale();
            } else {
                this.resolvedLifecycle = null;
                this.resolvedSizeResolver = null;
                this.resolvedScale = null;
            }
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0007\u0010\u0006J\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0017¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\fH\u0017¢\u0006\u0004\b\r\u0010\u000eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Lm5/h$b;", "", "Lm5/h;", "request", "", "b", "(Lm5/h;)V", "c", "Lm5/f;", "result", "a", "(Lm5/h;Lm5/f;)V", "Lm5/p;", "d", "(Lm5/h;Lm5/p;)V", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: m5.h$b */
    public interface b {
        default void a(C15669h request, C15667f result) {
        }

        default void b(C15669h request) {
        }

        default void c(C15669h request) {
        }

        default void d(C15669h request, C15677p result) {
        }
    }

    public /* synthetic */ C15669h(Context context, Object obj, InterfaceC16073c interfaceC16073c, b bVar, InterfaceC15089c.Key key, String str, Bitmap.Config config, ColorSpace colorSpace, EnumC15908e enumC15908e, Pair pair, InterfaceC13626j.a aVar, List list, InterfaceC16606c.a aVar2, Headers headers, Tags tags, boolean z10, boolean z11, boolean z12, boolean z13, EnumC15663b enumC15663b, EnumC15663b enumC15663b2, EnumC15663b enumC15663b3, AbstractC15779K abstractC15779K, AbstractC15779K abstractC15779K2, AbstractC15779K abstractC15779K3, AbstractC15779K abstractC15779K4, AbstractC6165l abstractC6165l, InterfaceC15913j interfaceC15913j, EnumC15911h enumC15911h, Parameters parameters, InterfaceC15089c.Key key2, Integer num, Drawable drawable, Integer num2, Drawable drawable2, Integer num3, Drawable drawable3, C15665d c15665d, C15664c c15664c, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, obj, interfaceC16073c, bVar, key, str, config, colorSpace, enumC15908e, pair, aVar, list, aVar2, headers, tags, z10, z11, z12, z13, enumC15663b, enumC15663b2, enumC15663b3, abstractC15779K, abstractC15779K2, abstractC15779K3, abstractC15779K4, abstractC6165l, interfaceC15913j, enumC15911h, parameters, key2, num, drawable, num2, drawable2, num3, drawable3, c15665d, c15664c);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C15669h)) {
            return false;
        }
        C15669h c15669h = (C15669h) other;
        if (Intrinsics.e(this.context, c15669h.context) && Intrinsics.e(this.data, c15669h.data) && Intrinsics.e(this.target, c15669h.target) && Intrinsics.e(this.listener, c15669h.listener) && Intrinsics.e(this.memoryCacheKey, c15669h.memoryCacheKey) && Intrinsics.e(this.diskCacheKey, c15669h.diskCacheKey) && this.bitmapConfig == c15669h.bitmapConfig) {
            return (Build.VERSION.SDK_INT < 26 || Intrinsics.e(this.colorSpace, c15669h.colorSpace)) && this.precision == c15669h.precision && Intrinsics.e(this.fetcherFactory, c15669h.fetcherFactory) && Intrinsics.e(this.decoderFactory, c15669h.decoderFactory) && Intrinsics.e(this.transformations, c15669h.transformations) && Intrinsics.e(this.transitionFactory, c15669h.transitionFactory) && Intrinsics.e(this.headers, c15669h.headers) && Intrinsics.e(this.tags, c15669h.tags) && this.allowConversionToBitmap == c15669h.allowConversionToBitmap && this.allowHardware == c15669h.allowHardware && this.allowRgb565 == c15669h.allowRgb565 && this.premultipliedAlpha == c15669h.premultipliedAlpha && this.memoryCachePolicy == c15669h.memoryCachePolicy && this.diskCachePolicy == c15669h.diskCachePolicy && this.networkCachePolicy == c15669h.networkCachePolicy && Intrinsics.e(this.interceptorDispatcher, c15669h.interceptorDispatcher) && Intrinsics.e(this.fetcherDispatcher, c15669h.fetcherDispatcher) && Intrinsics.e(this.decoderDispatcher, c15669h.decoderDispatcher) && Intrinsics.e(this.transformationDispatcher, c15669h.transformationDispatcher) && Intrinsics.e(this.placeholderMemoryCacheKey, c15669h.placeholderMemoryCacheKey) && Intrinsics.e(this.placeholderResId, c15669h.placeholderResId) && Intrinsics.e(this.placeholderDrawable, c15669h.placeholderDrawable) && Intrinsics.e(this.errorResId, c15669h.errorResId) && Intrinsics.e(this.errorDrawable, c15669h.errorDrawable) && Intrinsics.e(this.fallbackResId, c15669h.fallbackResId) && Intrinsics.e(this.fallbackDrawable, c15669h.fallbackDrawable) && Intrinsics.e(this.lifecycle, c15669h.lifecycle) && Intrinsics.e(this.sizeResolver, c15669h.sizeResolver) && this.scale == c15669h.scale && Intrinsics.e(this.parameters, c15669h.parameters) && Intrinsics.e(this.defined, c15669h.defined) && Intrinsics.e(this.defaults, c15669h.defaults);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C15669h(Context context, Object obj, InterfaceC16073c interfaceC16073c, b bVar, InterfaceC15089c.Key key, String str, Bitmap.Config config, ColorSpace colorSpace, EnumC15908e enumC15908e, Pair<? extends i.a<?>, ? extends Class<?>> pair, InterfaceC13626j.a aVar, List<? extends InterfaceC16405a> list, InterfaceC16606c.a aVar2, Headers headers, Tags tags, boolean z10, boolean z11, boolean z12, boolean z13, EnumC15663b enumC15663b, EnumC15663b enumC15663b2, EnumC15663b enumC15663b3, AbstractC15779K abstractC15779K, AbstractC15779K abstractC15779K2, AbstractC15779K abstractC15779K3, AbstractC15779K abstractC15779K4, AbstractC6165l abstractC6165l, InterfaceC15913j interfaceC15913j, EnumC15911h enumC15911h, Parameters parameters, InterfaceC15089c.Key key2, Integer num, Drawable drawable, Integer num2, Drawable drawable2, Integer num3, Drawable drawable3, C15665d c15665d, C15664c c15664c) {
        this.context = context;
        this.data = obj;
        this.target = interfaceC16073c;
        this.listener = bVar;
        this.memoryCacheKey = key;
        this.diskCacheKey = str;
        this.bitmapConfig = config;
        this.colorSpace = colorSpace;
        this.precision = enumC15908e;
        this.fetcherFactory = pair;
        this.decoderFactory = aVar;
        this.transformations = list;
        this.transitionFactory = aVar2;
        this.headers = headers;
        this.tags = tags;
        this.allowConversionToBitmap = z10;
        this.allowHardware = z11;
        this.allowRgb565 = z12;
        this.premultipliedAlpha = z13;
        this.memoryCachePolicy = enumC15663b;
        this.diskCachePolicy = enumC15663b2;
        this.networkCachePolicy = enumC15663b3;
        this.interceptorDispatcher = abstractC15779K;
        this.fetcherDispatcher = abstractC15779K2;
        this.decoderDispatcher = abstractC15779K3;
        this.transformationDispatcher = abstractC15779K4;
        this.lifecycle = abstractC6165l;
        this.sizeResolver = interfaceC15913j;
        this.scale = enumC15911h;
        this.parameters = parameters;
        this.placeholderMemoryCacheKey = key2;
        this.placeholderResId = num;
        this.placeholderDrawable = drawable;
        this.errorResId = num2;
        this.errorDrawable = drawable2;
        this.fallbackResId = num3;
        this.fallbackDrawable = drawable3;
        this.defined = c15665d;
        this.defaults = c15664c;
    }

    public static /* synthetic */ a R(C15669h c15669h, Context context, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            context = c15669h.context;
        }
        return c15669h.Q(context);
    }

    /* renamed from: A, reason: from getter */
    public final b getListener() {
        return this.listener;
    }

    /* renamed from: B, reason: from getter */
    public final InterfaceC15089c.Key getMemoryCacheKey() {
        return this.memoryCacheKey;
    }

    /* renamed from: C, reason: from getter */
    public final EnumC15663b getMemoryCachePolicy() {
        return this.memoryCachePolicy;
    }

    /* renamed from: D, reason: from getter */
    public final EnumC15663b getNetworkCachePolicy() {
        return this.networkCachePolicy;
    }

    /* renamed from: E, reason: from getter */
    public final Parameters getParameters() {
        return this.parameters;
    }

    public final Drawable F() {
        return C16845i.c(this, this.placeholderDrawable, this.placeholderResId, this.defaults.getPlaceholder());
    }

    /* renamed from: G, reason: from getter */
    public final InterfaceC15089c.Key getPlaceholderMemoryCacheKey() {
        return this.placeholderMemoryCacheKey;
    }

    /* renamed from: H, reason: from getter */
    public final EnumC15908e getPrecision() {
        return this.precision;
    }

    /* renamed from: I, reason: from getter */
    public final boolean getPremultipliedAlpha() {
        return this.premultipliedAlpha;
    }

    /* renamed from: J, reason: from getter */
    public final EnumC15911h getScale() {
        return this.scale;
    }

    /* renamed from: K, reason: from getter */
    public final InterfaceC15913j getSizeResolver() {
        return this.sizeResolver;
    }

    /* renamed from: L, reason: from getter */
    public final Tags getTags() {
        return this.tags;
    }

    /* renamed from: M, reason: from getter */
    public final InterfaceC16073c getTarget() {
        return this.target;
    }

    /* renamed from: N, reason: from getter */
    public final AbstractC15779K getTransformationDispatcher() {
        return this.transformationDispatcher;
    }

    public final List<InterfaceC16405a> O() {
        return this.transformations;
    }

    /* renamed from: P, reason: from getter */
    public final InterfaceC16606c.a getTransitionFactory() {
        return this.transitionFactory;
    }

    @JvmOverloads
    public final a Q(Context context) {
        return new a(this, context);
    }

    /* renamed from: g, reason: from getter */
    public final boolean getAllowConversionToBitmap() {
        return this.allowConversionToBitmap;
    }

    /* renamed from: h, reason: from getter */
    public final boolean getAllowHardware() {
        return this.allowHardware;
    }

    public int hashCode() {
        int iHashCode = ((this.context.hashCode() * 31) + this.data.hashCode()) * 31;
        InterfaceC16073c interfaceC16073c = this.target;
        int iHashCode2 = (iHashCode + (interfaceC16073c != null ? interfaceC16073c.hashCode() : 0)) * 31;
        b bVar = this.listener;
        int iHashCode3 = (iHashCode2 + (bVar != null ? bVar.hashCode() : 0)) * 31;
        InterfaceC15089c.Key key = this.memoryCacheKey;
        int iHashCode4 = (iHashCode3 + (key != null ? key.hashCode() : 0)) * 31;
        String str = this.diskCacheKey;
        int iHashCode5 = (((iHashCode4 + (str != null ? str.hashCode() : 0)) * 31) + this.bitmapConfig.hashCode()) * 31;
        ColorSpace colorSpace = this.colorSpace;
        int iHashCode6 = (((iHashCode5 + (colorSpace != null ? colorSpace.hashCode() : 0)) * 31) + this.precision.hashCode()) * 31;
        Pair<i.a<?>, Class<?>> pair = this.fetcherFactory;
        int iHashCode7 = (iHashCode6 + (pair != null ? pair.hashCode() : 0)) * 31;
        InterfaceC13626j.a aVar = this.decoderFactory;
        int iHashCode8 = (((((((((((((((((((((((((((((((((((((((iHashCode7 + (aVar != null ? aVar.hashCode() : 0)) * 31) + this.transformations.hashCode()) * 31) + this.transitionFactory.hashCode()) * 31) + this.headers.hashCode()) * 31) + this.tags.hashCode()) * 31) + Boolean.hashCode(this.allowConversionToBitmap)) * 31) + Boolean.hashCode(this.allowHardware)) * 31) + Boolean.hashCode(this.allowRgb565)) * 31) + Boolean.hashCode(this.premultipliedAlpha)) * 31) + this.memoryCachePolicy.hashCode()) * 31) + this.diskCachePolicy.hashCode()) * 31) + this.networkCachePolicy.hashCode()) * 31) + this.interceptorDispatcher.hashCode()) * 31) + this.fetcherDispatcher.hashCode()) * 31) + this.decoderDispatcher.hashCode()) * 31) + this.transformationDispatcher.hashCode()) * 31) + this.lifecycle.hashCode()) * 31) + this.sizeResolver.hashCode()) * 31) + this.scale.hashCode()) * 31) + this.parameters.hashCode()) * 31;
        InterfaceC15089c.Key key2 = this.placeholderMemoryCacheKey;
        int iHashCode9 = (iHashCode8 + (key2 != null ? key2.hashCode() : 0)) * 31;
        Integer num = this.placeholderResId;
        int iHashCode10 = (iHashCode9 + (num != null ? num.hashCode() : 0)) * 31;
        Drawable drawable = this.placeholderDrawable;
        int iHashCode11 = (iHashCode10 + (drawable != null ? drawable.hashCode() : 0)) * 31;
        Integer num2 = this.errorResId;
        int iHashCode12 = (iHashCode11 + (num2 != null ? num2.hashCode() : 0)) * 31;
        Drawable drawable2 = this.errorDrawable;
        int iHashCode13 = (iHashCode12 + (drawable2 != null ? drawable2.hashCode() : 0)) * 31;
        Integer num3 = this.fallbackResId;
        int iHashCode14 = (iHashCode13 + (num3 != null ? num3.hashCode() : 0)) * 31;
        Drawable drawable3 = this.fallbackDrawable;
        return ((((iHashCode14 + (drawable3 != null ? drawable3.hashCode() : 0)) * 31) + this.defined.hashCode()) * 31) + this.defaults.hashCode();
    }

    /* renamed from: i, reason: from getter */
    public final boolean getAllowRgb565() {
        return this.allowRgb565;
    }

    /* renamed from: j, reason: from getter */
    public final Bitmap.Config getBitmapConfig() {
        return this.bitmapConfig;
    }

    /* renamed from: k, reason: from getter */
    public final ColorSpace getColorSpace() {
        return this.colorSpace;
    }

    /* renamed from: l, reason: from getter */
    public final Context getContext() {
        return this.context;
    }

    /* renamed from: m, reason: from getter */
    public final Object getData() {
        return this.data;
    }

    /* renamed from: n, reason: from getter */
    public final AbstractC15779K getDecoderDispatcher() {
        return this.decoderDispatcher;
    }

    /* renamed from: o, reason: from getter */
    public final InterfaceC13626j.a getDecoderFactory() {
        return this.decoderFactory;
    }

    /* renamed from: p, reason: from getter */
    public final C15664c getDefaults() {
        return this.defaults;
    }

    /* renamed from: q, reason: from getter */
    public final C15665d getDefined() {
        return this.defined;
    }

    /* renamed from: r, reason: from getter */
    public final String getDiskCacheKey() {
        return this.diskCacheKey;
    }

    /* renamed from: s, reason: from getter */
    public final EnumC15663b getDiskCachePolicy() {
        return this.diskCachePolicy;
    }

    public final Drawable t() {
        return C16845i.c(this, this.errorDrawable, this.errorResId, this.defaults.getError());
    }

    public final Drawable u() {
        return C16845i.c(this, this.fallbackDrawable, this.fallbackResId, this.defaults.getFallback());
    }

    /* renamed from: v, reason: from getter */
    public final AbstractC15779K getFetcherDispatcher() {
        return this.fetcherDispatcher;
    }

    public final Pair<i.a<?>, Class<?>> w() {
        return this.fetcherFactory;
    }

    /* renamed from: x, reason: from getter */
    public final Headers getHeaders() {
        return this.headers;
    }

    /* renamed from: y, reason: from getter */
    public final AbstractC15779K getInterceptorDispatcher() {
        return this.interceptorDispatcher;
    }

    /* renamed from: z, reason: from getter */
    public final AbstractC6165l getLifecycle() {
        return this.lifecycle;
    }
}
