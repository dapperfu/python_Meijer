package l5;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import androidx.view.AbstractC6023l;
import c5.InterfaceC6364j;
import f5.i;
import j5.InterfaceC14857c;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l5.Parameters;
import m5.C15554d;
import m5.C15561k;
import m5.C15563m;
import m5.EnumC15555e;
import m5.EnumC15558h;
import m5.InterfaceC15560j;
import m5.InterfaceC15562l;
import m5.Size;
import n5.C15778b;
import n5.InterfaceC15779c;
import n5.InterfaceC15780d;
import o5.InterfaceC15996a;
import okhttp3.Headers;
import p5.C16259a;
import p5.InterfaceC16261c;
import q5.C16452d;
import q5.C16457i;
import q5.C16458j;
import qv.AbstractC16618K;

@Metadata(d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\bh\u0018\u00002\u00020\u0001:\u0002SOB÷\u0002\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u001c\u0010\u0016\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0015\u0018\u00010\u0013\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010$\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020\"\u0012\u0006\u0010&\u001a\u00020\"\u0012\u0006\u0010(\u001a\u00020'\u0012\u0006\u0010)\u001a\u00020'\u0012\u0006\u0010*\u001a\u00020'\u0012\u0006\u0010,\u001a\u00020+\u0012\u0006\u0010-\u001a\u00020+\u0012\u0006\u0010.\u001a\u00020+\u0012\u0006\u0010/\u001a\u00020+\u0012\u0006\u00101\u001a\u000200\u0012\u0006\u00103\u001a\u000202\u0012\u0006\u00105\u001a\u000204\u0012\u0006\u00107\u001a\u000206\u0012\b\u00108\u001a\u0004\u0018\u00010\t\u0012\b\u0010:\u001a\u0004\u0018\u000109\u0012\b\u0010<\u001a\u0004\u0018\u00010;\u0012\b\u0010=\u001a\u0004\u0018\u000109\u0012\b\u0010>\u001a\u0004\u0018\u00010;\u0012\b\u0010?\u001a\u0004\u0018\u000109\u0012\b\u0010@\u001a\u0004\u0018\u00010;\u0012\u0006\u0010B\u001a\u00020A\u0012\u0006\u0010D\u001a\u00020C¢\u0006\u0004\bE\u0010FJ\u0019\u0010H\u001a\u00020G2\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\bH\u0010IJ\u001a\u0010K\u001a\u00020\"2\b\u0010J\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\bK\u0010LJ\u000f\u0010M\u001a\u000209H\u0016¢\u0006\u0004\bM\u0010NR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR\u0017\u0010\u0004\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u0010ZR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\ba\u0010bR\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\be\u0010fR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\bg\u0010h\u001a\u0004\bi\u0010jR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\bk\u0010l\u001a\u0004\bm\u0010nR\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\bo\u0010p\u001a\u0004\bq\u0010rR-\u0010\u0016\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0015\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\bi\u0010s\u001a\u0004\bt\u0010uR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\bm\u0010v\u001a\u0004\bw\u0010xR\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0006¢\u0006\f\n\u0004\bQ\u0010y\u001a\u0004\bz\u0010{R\u0017\u0010\u001d\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\bU\u0010|\u001a\u0004\b}\u0010~R\u001a\u0010\u001f\u001a\u00020\u001e8\u0006¢\u0006\u000f\n\u0005\b\u007f\u0010\u0080\u0001\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R\u001a\u0010!\u001a\u00020 8\u0006¢\u0006\u000f\n\u0005\bw\u0010\u0083\u0001\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001R\u001a\u0010#\u001a\u00020\"8\u0006¢\u0006\u000f\n\u0006\b\u0086\u0001\u0010\u0087\u0001\u001a\u0005\bg\u0010\u0088\u0001R\u001a\u0010$\u001a\u00020\"8\u0006¢\u0006\u000f\n\u0006\b\u0089\u0001\u0010\u0087\u0001\u001a\u0005\bk\u0010\u0088\u0001R\u0019\u0010%\u001a\u00020\"8\u0006¢\u0006\u000e\n\u0005\be\u0010\u0087\u0001\u001a\u0005\bo\u0010\u0088\u0001R\u001b\u0010&\u001a\u00020\"8\u0006¢\u0006\u0010\n\u0006\b\u008a\u0001\u0010\u0087\u0001\u001a\u0006\b\u008b\u0001\u0010\u0088\u0001R\u001b\u0010(\u001a\u00020'8\u0006¢\u0006\u0010\n\u0006\b\u008c\u0001\u0010\u008d\u0001\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001R\u001b\u0010)\u001a\u00020'8\u0006¢\u0006\u0010\n\u0006\b\u0090\u0001\u0010\u008d\u0001\u001a\u0006\b\u008a\u0001\u0010\u008f\u0001R\u001b\u0010*\u001a\u00020'8\u0006¢\u0006\u0010\n\u0006\b\u0091\u0001\u0010\u008d\u0001\u001a\u0006\b\u0092\u0001\u0010\u008f\u0001R\u001a\u0010,\u001a\u00020+8\u0006¢\u0006\u000f\n\u0005\bt\u0010\u0093\u0001\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001R\u001b\u0010-\u001a\u00020+8\u0006¢\u0006\u0010\n\u0006\b\u0081\u0001\u0010\u0093\u0001\u001a\u0006\b\u0091\u0001\u0010\u0095\u0001R\u001a\u0010.\u001a\u00020+8\u0006¢\u0006\u000f\n\u0006\b\u0094\u0001\u0010\u0093\u0001\u001a\u0005\b\u007f\u0010\u0095\u0001R\u001b\u0010/\u001a\u00020+8\u0006¢\u0006\u0010\n\u0006\b\u0096\u0001\u0010\u0093\u0001\u001a\u0006\b\u0097\u0001\u0010\u0095\u0001R\u001a\u00101\u001a\u0002008\u0006¢\u0006\u000f\n\u0005\b]\u0010\u0098\u0001\u001a\u0006\b\u0096\u0001\u0010\u0099\u0001R\u001a\u00103\u001a\u0002028\u0006¢\u0006\u000f\n\u0005\ba\u0010\u009a\u0001\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001R\u001b\u00105\u001a\u0002048\u0006¢\u0006\u0010\n\u0006\b\u008e\u0001\u0010\u009d\u0001\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001R\u001b\u00107\u001a\u0002068\u0006¢\u0006\u0010\n\u0006\b\u0092\u0001\u0010 \u0001\u001a\u0006\b¡\u0001\u0010¢\u0001R\u001b\u00108\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\u000e\n\u0005\b¡\u0001\u0010`\u001a\u0005\b£\u0001\u0010bR\u0018\u0010:\u001a\u0004\u0018\u0001098\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¤\u0001\u0010¥\u0001R\u0018\u0010<\u001a\u0004\u0018\u00010;8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b£\u0001\u0010¦\u0001R\u0017\u0010=\u001a\u0004\u0018\u0001098\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bq\u0010¥\u0001R\u0018\u0010>\u001a\u0004\u0018\u00010;8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008b\u0001\u0010¦\u0001R\u0018\u0010?\u001a\u0004\u0018\u0001098\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009e\u0001\u0010¥\u0001R\u0018\u0010@\u001a\u0004\u0018\u00010;8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009b\u0001\u0010¦\u0001R\u001b\u0010B\u001a\u00020A8\u0006¢\u0006\u0010\n\u0006\b\u0084\u0001\u0010§\u0001\u001a\u0006\b\u0089\u0001\u0010¨\u0001R\u001a\u0010D\u001a\u00020C8\u0006¢\u0006\u000f\n\u0005\bY\u0010©\u0001\u001a\u0006\b\u0086\u0001\u0010ª\u0001R\u0016\u0010¬\u0001\u001a\u0004\u0018\u00010;8F¢\u0006\b\u001a\u0006\b¤\u0001\u0010«\u0001R\u0016\u0010\u00ad\u0001\u001a\u0004\u0018\u00010;8F¢\u0006\b\u001a\u0006\b\u008c\u0001\u0010«\u0001R\u0016\u0010®\u0001\u001a\u0004\u0018\u00010;8F¢\u0006\b\u001a\u0006\b\u0090\u0001\u0010«\u0001¨\u0006¯\u0001"}, d2 = {"Ll5/h;", "", "Landroid/content/Context;", "context", "data", "Ln5/c;", "target", "Ll5/h$b;", "listener", "Lj5/c$b;", "memoryCacheKey", "", "diskCacheKey", "Landroid/graphics/Bitmap$Config;", "bitmapConfig", "Landroid/graphics/ColorSpace;", "colorSpace", "Lm5/e;", "precision", "Lkotlin/Pair;", "Lf5/i$a;", "Ljava/lang/Class;", "fetcherFactory", "Lc5/j$a;", "decoderFactory", "", "Lo5/a;", "transformations", "Lp5/c$a;", "transitionFactory", "Lokhttp3/Headers;", "headers", "Ll5/q;", "tags", "", "allowConversionToBitmap", "allowHardware", "allowRgb565", "premultipliedAlpha", "Ll5/b;", "memoryCachePolicy", "diskCachePolicy", "networkCachePolicy", "Lqv/K;", "interceptorDispatcher", "fetcherDispatcher", "decoderDispatcher", "transformationDispatcher", "Landroidx/lifecycle/l;", "lifecycle", "Lm5/j;", "sizeResolver", "Lm5/h;", "scale", "Ll5/m;", "parameters", "placeholderMemoryCacheKey", "", "placeholderResId", "Landroid/graphics/drawable/Drawable;", "placeholderDrawable", "errorResId", "errorDrawable", "fallbackResId", "fallbackDrawable", "Ll5/d;", "defined", "Ll5/c;", "defaults", "<init>", "(Landroid/content/Context;Ljava/lang/Object;Ln5/c;Ll5/h$b;Lj5/c$b;Ljava/lang/String;Landroid/graphics/Bitmap$Config;Landroid/graphics/ColorSpace;Lm5/e;Lkotlin/Pair;Lc5/j$a;Ljava/util/List;Lp5/c$a;Lokhttp3/Headers;Ll5/q;ZZZZLl5/b;Ll5/b;Ll5/b;Lqv/K;Lqv/K;Lqv/K;Lqv/K;Landroidx/lifecycle/l;Lm5/j;Lm5/h;Ll5/m;Lj5/c$b;Ljava/lang/Integer;Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;Landroid/graphics/drawable/Drawable;Ll5/d;Ll5/c;)V", "Ll5/h$a;", "Q", "(Landroid/content/Context;)Ll5/h$a;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "a", "Landroid/content/Context;", "l", "()Landroid/content/Context;", "b", "Ljava/lang/Object;", "m", "()Ljava/lang/Object;", "c", "Ln5/c;", "M", "()Ln5/c;", "d", "Ll5/h$b;", "A", "()Ll5/h$b;", "e", "Lj5/c$b;", "B", "()Lj5/c$b;", "f", "Ljava/lang/String;", "r", "()Ljava/lang/String;", "g", "Landroid/graphics/Bitmap$Config;", "j", "()Landroid/graphics/Bitmap$Config;", "h", "Landroid/graphics/ColorSpace;", "k", "()Landroid/graphics/ColorSpace;", "i", "Lm5/e;", "H", "()Lm5/e;", "Lkotlin/Pair;", "w", "()Lkotlin/Pair;", "Lc5/j$a;", "o", "()Lc5/j$a;", "Ljava/util/List;", "O", "()Ljava/util/List;", "Lp5/c$a;", "P", "()Lp5/c$a;", "n", "Lokhttp3/Headers;", "x", "()Lokhttp3/Headers;", "Ll5/q;", "L", "()Ll5/q;", "p", "Z", "()Z", "q", "s", "I", "t", "Ll5/b;", "C", "()Ll5/b;", "u", "v", "D", "Lqv/K;", "y", "()Lqv/K;", "z", "N", "Landroidx/lifecycle/l;", "()Landroidx/lifecycle/l;", "Lm5/j;", "K", "()Lm5/j;", "Lm5/h;", "J", "()Lm5/h;", "Ll5/m;", "E", "()Ll5/m;", "G", "F", "Ljava/lang/Integer;", "Landroid/graphics/drawable/Drawable;", "Ll5/d;", "()Ll5/d;", "Ll5/c;", "()Ll5/c;", "()Landroid/graphics/drawable/Drawable;", "placeholder", "error", "fallback", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: l5.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C15372h {

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    private final AbstractC6023l lifecycle;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC15560j sizeResolver;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private final EnumC15558h scale;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private final Parameters parameters;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC14857c.Key placeholderMemoryCacheKey;

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
    private final C15368d defined;

    /* renamed from: M, reason: collision with root package name and from kotlin metadata */
    private final C15367c defaults;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Object data;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC15779c target;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final b listener;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC14857c.Key memoryCacheKey;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final String diskCacheKey;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Bitmap.Config bitmapConfig;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final ColorSpace colorSpace;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final EnumC15555e precision;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final Pair<i.a<?>, Class<?>> fetcherFactory;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC6364j.a decoderFactory;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final List<InterfaceC15996a> transformations;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16261c.a transitionFactory;

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
    private final EnumC15366b memoryCachePolicy;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final EnumC15366b diskCachePolicy;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final EnumC15366b networkCachePolicy;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final AbstractC16618K interceptorDispatcher;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final AbstractC16618K fetcherDispatcher;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final AbstractC16618K decoderDispatcher;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final AbstractC16618K transformationDispatcher;

    @Metadata(d1 = {"\u0000ô\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001a\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00002\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00002\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00002\b\u0010\u001a\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00002\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b \u0010\u001cJ\u0017\u0010#\u001a\u00020\u00002\b\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b#\u0010$J\u0015\u0010'\u001a\u00020\u00002\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J\u0015\u0010*\u001a\u00020\u00002\u0006\u0010)\u001a\u00020\u0010¢\u0006\u0004\b*\u0010+J\u0015\u0010-\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u0013¢\u0006\u0004\b-\u0010.J\u0015\u00101\u001a\u00020\u00002\u0006\u00100\u001a\u00020/¢\u0006\u0004\b1\u00102J\u0015\u00105\u001a\u00020\u00002\u0006\u00104\u001a\u000203¢\u0006\u0004\b5\u00106J\u0015\u00109\u001a\u00020\u00002\u0006\u00108\u001a\u000207¢\u0006\u0004\b9\u0010:J\u0015\u0010;\u001a\u00020\u00002\u0006\u00108\u001a\u000207¢\u0006\u0004\b;\u0010:J\u001d\u0010>\u001a\u00020\u00002\u0006\u0010<\u001a\u00020\u00192\u0006\u0010=\u001a\u00020\u0019¢\u0006\u0004\b>\u0010?J\u0017\u0010@\u001a\u00020\u00002\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b@\u0010\u001cJ\u0017\u0010A\u001a\u00020\u00002\b\u0010\u001a\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\bA\u0010\u001fJ\u0017\u0010D\u001a\u00020\u00002\b\b\u0001\u0010C\u001a\u00020B¢\u0006\u0004\bD\u0010EJ\u0017\u0010F\u001a\u00020\u00002\b\b\u0001\u0010C\u001a\u00020B¢\u0006\u0004\bF\u0010EJ\u0017\u0010G\u001a\u00020\u00002\b\b\u0001\u0010C\u001a\u00020B¢\u0006\u0004\bG\u0010EJ\u0015\u0010J\u001a\u00020\u00002\u0006\u0010I\u001a\u00020H¢\u0006\u0004\bJ\u0010KJ\u0017\u0010N\u001a\u00020\u00002\b\u0010M\u001a\u0004\u0018\u00010L¢\u0006\u0004\bN\u0010OJ\u0015\u0010P\u001a\u00020\u00002\u0006\u00104\u001a\u000203¢\u0006\u0004\bP\u00106J\u0015\u0010R\u001a\u00020\u00002\u0006\u0010Q\u001a\u00020B¢\u0006\u0004\bR\u0010EJ\u0015\u0010U\u001a\u00020\u00002\u0006\u0010T\u001a\u00020S¢\u0006\u0004\bU\u0010VJ\u0015\u0010Y\u001a\u00020\u00002\u0006\u0010X\u001a\u00020W¢\u0006\u0004\bY\u0010ZJ\r\u0010[\u001a\u00020\u0006¢\u0006\u0004\b[\u0010\\R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010]R\u0016\u0010X\u001a\u00020W8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010^R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010_R\u0018\u0010M\u001a\u0004\u0018\u00010L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010`R\u0018\u0010\"\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010aR\u0018\u0010c\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010bR\u0018\u0010e\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010dR\u0018\u0010h\u001a\u0004\u0018\u00010f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010gR\u0018\u0010k\u001a\u0004\u0018\u00010i8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010jR\u0018\u00100\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010lR,\u0010q\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030n\u0012\b\u0012\u0006\u0012\u0002\b\u00030o\u0018\u00010m8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010pR\u0018\u0010t\u001a\u0004\u0018\u00010r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010sR\u001c\u0010x\u001a\b\u0012\u0004\u0012\u00020v0u8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010wR\u0018\u0010z\u001a\u0004\u0018\u00010S8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010yR\u0018\u0010}\u001a\u0004\u0018\u00010{8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010|R)\u0010\u0080\u0001\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030o\u0012\u0004\u0012\u00020\u0001\u0018\u00010~8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010\u007fR\u0018\u0010\u0082\u0001\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bA\u0010\u0081\u0001R\u001a\u0010\u0084\u0001\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b@\u0010\u0083\u0001R\u001a\u0010\u0085\u0001\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b1\u0010\u0083\u0001R\u0018\u0010\u0086\u0001\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\f\u0010\u0081\u0001R\u001a\u0010\u0088\u0001\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\n\u0010\u0087\u0001R\u001a\u0010\u0089\u0001\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u000e\u0010\u0087\u0001R\u001a\u0010\u008a\u0001\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0014\u0010\u0087\u0001R\u001b\u0010\u008d\u0001\u001a\u0005\u0018\u00010\u008b\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0011\u0010\u008c\u0001R\u001b\u0010\u008e\u0001\u001a\u0005\u0018\u00010\u008b\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b-\u0010\u008c\u0001R\u001b\u0010\u008f\u0001\u001a\u0005\u0018\u00010\u008b\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b'\u0010\u008c\u0001R\u001b\u0010\u0090\u0001\u001a\u0005\u0018\u00010\u008b\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b*\u0010\u008c\u0001R\u001b\u0010\u0093\u0001\u001a\u0005\u0018\u00010\u0091\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bJ\u0010\u0092\u0001R\u0019\u0010\u0094\u0001\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010bR\u001a\u0010\u0096\u0001\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\bU\u0010\u0095\u0001R\u001c\u0010\u009a\u0001\u001a\u0005\u0018\u00010\u0097\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0099\u0001R\u001b\u0010\u009c\u0001\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u0095\u0001R\u001c\u0010\u009e\u0001\u001a\u0005\u0018\u00010\u0097\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u0099\u0001R\u001b\u0010 \u0001\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b\u009f\u0001\u0010\u0095\u0001R\u001c\u0010¢\u0001\u001a\u0005\u0018\u00010\u0097\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¡\u0001\u0010\u0099\u0001R\u001b\u0010¥\u0001\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b£\u0001\u0010¤\u0001R\u001b\u0010¨\u0001\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¦\u0001\u0010§\u0001R\u001a\u0010,\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b©\u0001\u0010ª\u0001R\u001b\u0010¬\u0001\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b«\u0001\u0010¤\u0001R\u001b\u0010®\u0001\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u00ad\u0001\u0010§\u0001R\u001b\u0010°\u0001\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¯\u0001\u0010ª\u0001¨\u0006±\u0001"}, d2 = {"Ll5/h$a;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Ll5/h;", "request", "(Ll5/h;Landroid/content/Context;)V", "", "u", "()V", "t", "Landroidx/lifecycle/l;", "v", "()Landroidx/lifecycle/l;", "Lm5/j;", "x", "()Lm5/j;", "Lm5/h;", "w", "()Lm5/h;", "data", "f", "(Ljava/lang/Object;)Ll5/h$a;", "", "key", "n", "(Ljava/lang/String;)Ll5/h$a;", "Lj5/c$b;", "m", "(Lj5/c$b;)Ll5/h$a;", "h", "Ll5/h$b;", "listener", "l", "(Ll5/h$b;)Ll5/h$a;", "Lm5/i;", "size", "z", "(Lm5/i;)Ll5/h$a;", "resolver", "A", "(Lm5/j;)Ll5/h$a;", "scale", "y", "(Lm5/h;)Ll5/h$a;", "Lm5/e;", "precision", "s", "(Lm5/e;)Ll5/h$a;", "", "enable", "b", "(Z)Ll5/h$a;", "Ll5/b;", "policy", "o", "(Ll5/b;)Ll5/h$a;", "i", "name", "value", "a", "(Ljava/lang/String;Ljava/lang/String;)Ll5/h$a;", "r", "q", "", "drawableResId", "p", "(I)Ll5/h$a;", "j", "k", "Landroid/widget/ImageView;", "imageView", "B", "(Landroid/widget/ImageView;)Ll5/h$a;", "Ln5/c;", "target", "C", "(Ln5/c;)Ll5/h$a;", "e", "durationMillis", "d", "Lp5/c$a;", "transition", "D", "(Lp5/c$a;)Ll5/h$a;", "Ll5/c;", "defaults", "g", "(Ll5/c;)Ll5/h$a;", "c", "()Ll5/h;", "Landroid/content/Context;", "Ll5/c;", "Ljava/lang/Object;", "Ln5/c;", "Ll5/h$b;", "Lj5/c$b;", "memoryCacheKey", "Ljava/lang/String;", "diskCacheKey", "Landroid/graphics/Bitmap$Config;", "Landroid/graphics/Bitmap$Config;", "bitmapConfig", "Landroid/graphics/ColorSpace;", "Landroid/graphics/ColorSpace;", "colorSpace", "Lm5/e;", "Lkotlin/Pair;", "Lf5/i$a;", "Ljava/lang/Class;", "Lkotlin/Pair;", "fetcherFactory", "Lc5/j$a;", "Lc5/j$a;", "decoderFactory", "", "Lo5/a;", "Ljava/util/List;", "transformations", "Lp5/c$a;", "transitionFactory", "Lokhttp3/Headers$a;", "Lokhttp3/Headers$a;", "headers", "", "Ljava/util/Map;", "tags", "Z", "allowConversionToBitmap", "Ljava/lang/Boolean;", "allowHardware", "allowRgb565", "premultipliedAlpha", "Ll5/b;", "memoryCachePolicy", "diskCachePolicy", "networkCachePolicy", "Lqv/K;", "Lqv/K;", "interceptorDispatcher", "fetcherDispatcher", "decoderDispatcher", "transformationDispatcher", "Ll5/m$a;", "Ll5/m$a;", "parameters", "placeholderMemoryCacheKey", "Ljava/lang/Integer;", "placeholderResId", "Landroid/graphics/drawable/Drawable;", "E", "Landroid/graphics/drawable/Drawable;", "placeholderDrawable", "F", "errorResId", "G", "errorDrawable", "H", "fallbackResId", "I", "fallbackDrawable", "J", "Landroidx/lifecycle/l;", "lifecycle", "K", "Lm5/j;", "sizeResolver", "L", "Lm5/h;", "M", "resolvedLifecycle", "N", "resolvedSizeResolver", "O", "resolvedScale", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: l5.h$a */
    public static final class a {

        /* renamed from: A, reason: collision with root package name and from kotlin metadata */
        private AbstractC16618K transformationDispatcher;

        /* renamed from: B, reason: collision with root package name and from kotlin metadata */
        private Parameters.a parameters;

        /* renamed from: C, reason: collision with root package name and from kotlin metadata */
        private InterfaceC14857c.Key placeholderMemoryCacheKey;

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
        private AbstractC6023l lifecycle;

        /* renamed from: K, reason: collision with root package name and from kotlin metadata */
        private InterfaceC15560j sizeResolver;

        /* renamed from: L, reason: collision with root package name and from kotlin metadata */
        private EnumC15558h scale;

        /* renamed from: M, reason: collision with root package name and from kotlin metadata */
        private AbstractC6023l resolvedLifecycle;

        /* renamed from: N, reason: collision with root package name and from kotlin metadata */
        private InterfaceC15560j resolvedSizeResolver;

        /* renamed from: O, reason: collision with root package name and from kotlin metadata */
        private EnumC15558h resolvedScale;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Context context;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private C15367c defaults;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private Object data;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private InterfaceC15779c target;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private b listener;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private InterfaceC14857c.Key memoryCacheKey;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private String diskCacheKey;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        private Bitmap.Config bitmapConfig;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        private ColorSpace colorSpace;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata */
        private EnumC15555e precision;

        /* renamed from: k, reason: collision with root package name and from kotlin metadata */
        private Pair<? extends i.a<?>, ? extends Class<?>> fetcherFactory;

        /* renamed from: l, reason: collision with root package name and from kotlin metadata */
        private InterfaceC6364j.a decoderFactory;

        /* renamed from: m, reason: collision with root package name and from kotlin metadata */
        private List<? extends InterfaceC15996a> transformations;

        /* renamed from: n, reason: collision with root package name and from kotlin metadata */
        private InterfaceC16261c.a transitionFactory;

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
        private EnumC15366b memoryCachePolicy;

        /* renamed from: v, reason: collision with root package name and from kotlin metadata */
        private EnumC15366b diskCachePolicy;

        /* renamed from: w, reason: collision with root package name and from kotlin metadata */
        private EnumC15366b networkCachePolicy;

        /* renamed from: x, reason: collision with root package name and from kotlin metadata */
        private AbstractC16618K interceptorDispatcher;

        /* renamed from: y, reason: collision with root package name and from kotlin metadata */
        private AbstractC16618K fetcherDispatcher;

        /* renamed from: z, reason: collision with root package name and from kotlin metadata */
        private AbstractC16618K decoderDispatcher;

        public a(Context context) {
            this.context = context;
            this.defaults = C16457i.b();
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

        public final a n(String key) {
            return m(key != null ? new InterfaceC14857c.Key(key, null, 2, null) : null);
        }

        public final a r(String key) {
            return q(key != null ? new InterfaceC14857c.Key(key, null, 2, null) : null);
        }

        private final AbstractC6023l v() {
            InterfaceC15779c interfaceC15779c = this.target;
            AbstractC6023l abstractC6023lC = C16452d.c(interfaceC15779c instanceof InterfaceC15780d ? ((InterfaceC15780d) interfaceC15779c).getView().getContext() : this.context);
            return abstractC6023lC == null ? C15371g.f148551b : abstractC6023lC;
        }

        private final EnumC15558h w() {
            View view;
            InterfaceC15560j interfaceC15560j = this.sizeResolver;
            View view2 = null;
            InterfaceC15562l interfaceC15562l = interfaceC15560j instanceof InterfaceC15562l ? (InterfaceC15562l) interfaceC15560j : null;
            if (interfaceC15562l == null || (view = interfaceC15562l.getView()) == null) {
                InterfaceC15779c interfaceC15779c = this.target;
                InterfaceC15780d interfaceC15780d = interfaceC15779c instanceof InterfaceC15780d ? (InterfaceC15780d) interfaceC15779c : null;
                if (interfaceC15780d != null) {
                    view2 = interfaceC15780d.getView();
                }
            } else {
                view2 = view;
            }
            return view2 instanceof ImageView ? C16458j.o((ImageView) view2) : EnumC15558h.f149848b;
        }

        private final InterfaceC15560j x() {
            ImageView.ScaleType scaleType;
            InterfaceC15779c interfaceC15779c = this.target;
            if (!(interfaceC15779c instanceof InterfaceC15780d)) {
                return new C15554d(this.context);
            }
            View view = ((InterfaceC15780d) interfaceC15779c).getView();
            return ((view instanceof ImageView) && ((scaleType = ((ImageView) view).getScaleType()) == ImageView.ScaleType.CENTER || scaleType == ImageView.ScaleType.MATRIX)) ? C15561k.a(Size.f149852d) : C15563m.b(view, false, 2, null);
        }

        public final a A(InterfaceC15560j resolver) {
            this.sizeResolver = resolver;
            u();
            return this;
        }

        public final a B(ImageView imageView) {
            return C(new C15778b(imageView));
        }

        public final a C(InterfaceC15779c target) {
            this.target = target;
            u();
            return this;
        }

        public final a D(InterfaceC16261c.a transition) {
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

        public final C15372h c() {
            Context context = this.context;
            Object obj = this.data;
            if (obj == null) {
                obj = C15374j.f148633a;
            }
            Object obj2 = obj;
            InterfaceC15779c interfaceC15779c = this.target;
            b bVar = this.listener;
            InterfaceC14857c.Key key = this.memoryCacheKey;
            String str = this.diskCacheKey;
            Bitmap.Config configE = this.bitmapConfig;
            if (configE == null) {
                configE = this.defaults.getBitmapConfig();
            }
            Bitmap.Config config = configE;
            ColorSpace colorSpace = this.colorSpace;
            EnumC15555e enumC15555eO = this.precision;
            if (enumC15555eO == null) {
                enumC15555eO = this.defaults.getPrecision();
            }
            EnumC15555e enumC15555e = enumC15555eO;
            Pair<? extends i.a<?>, ? extends Class<?>> pair = this.fetcherFactory;
            InterfaceC6364j.a aVar = this.decoderFactory;
            List<? extends InterfaceC15996a> list = this.transformations;
            InterfaceC16261c.a aVarQ = this.transitionFactory;
            if (aVarQ == null) {
                aVarQ = this.defaults.getTransitionFactory();
            }
            InterfaceC16261c.a aVar2 = aVarQ;
            Headers.a aVar3 = this.headers;
            Headers headersY = C16458j.y(aVar3 != null ? aVar3.f() : null);
            Map<Class<?>, ? extends Object> map = this.tags;
            Tags tagsX = C16458j.x(map != null ? Tags.INSTANCE.a(map) : null);
            boolean z10 = this.allowConversionToBitmap;
            Boolean bool = this.allowHardware;
            boolean zBooleanValue = bool != null ? bool.booleanValue() : this.defaults.getAllowHardware();
            Boolean bool2 = this.allowRgb565;
            boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : this.defaults.getAllowRgb565();
            boolean z11 = this.premultipliedAlpha;
            EnumC15366b enumC15366bL = this.memoryCachePolicy;
            if (enumC15366bL == null) {
                enumC15366bL = this.defaults.getMemoryCachePolicy();
            }
            EnumC15366b enumC15366b = enumC15366bL;
            EnumC15366b enumC15366bG = this.diskCachePolicy;
            if (enumC15366bG == null) {
                enumC15366bG = this.defaults.getDiskCachePolicy();
            }
            EnumC15366b enumC15366b2 = enumC15366bG;
            EnumC15366b enumC15366bM = this.networkCachePolicy;
            if (enumC15366bM == null) {
                enumC15366bM = this.defaults.getNetworkCachePolicy();
            }
            EnumC15366b enumC15366b3 = enumC15366bM;
            AbstractC16618K abstractC16618KK = this.interceptorDispatcher;
            if (abstractC16618KK == null) {
                abstractC16618KK = this.defaults.getInterceptorDispatcher();
            }
            AbstractC16618K abstractC16618K = abstractC16618KK;
            AbstractC16618K abstractC16618KJ = this.fetcherDispatcher;
            if (abstractC16618KJ == null) {
                abstractC16618KJ = this.defaults.getFetcherDispatcher();
            }
            AbstractC16618K abstractC16618K2 = abstractC16618KJ;
            AbstractC16618K abstractC16618KF = this.decoderDispatcher;
            if (abstractC16618KF == null) {
                abstractC16618KF = this.defaults.getDecoderDispatcher();
            }
            AbstractC16618K abstractC16618K3 = abstractC16618KF;
            AbstractC16618K abstractC16618KP = this.transformationDispatcher;
            if (abstractC16618KP == null) {
                abstractC16618KP = this.defaults.getTransformationDispatcher();
            }
            AbstractC16618K abstractC16618K4 = abstractC16618KP;
            AbstractC6023l abstractC6023lV = this.lifecycle;
            if (abstractC6023lV == null && (abstractC6023lV = this.resolvedLifecycle) == null) {
                abstractC6023lV = v();
            }
            AbstractC6023l abstractC6023l = abstractC6023lV;
            InterfaceC15560j interfaceC15560jX = this.sizeResolver;
            if (interfaceC15560jX == null && (interfaceC15560jX = this.resolvedSizeResolver) == null) {
                interfaceC15560jX = x();
            }
            InterfaceC15560j interfaceC15560j = interfaceC15560jX;
            EnumC15558h enumC15558hW = this.scale;
            if (enumC15558hW == null && (enumC15558hW = this.resolvedScale) == null) {
                enumC15558hW = w();
            }
            EnumC15558h enumC15558h = enumC15558hW;
            Parameters.a aVar4 = this.parameters;
            return new C15372h(context, obj2, interfaceC15779c, bVar, key, str, config, colorSpace, enumC15555e, pair, aVar, list, aVar2, headersY, tagsX, z10, zBooleanValue, zBooleanValue2, z11, enumC15366b, enumC15366b2, enumC15366b3, abstractC16618K, abstractC16618K2, abstractC16618K3, abstractC16618K4, abstractC6023l, interfaceC15560j, enumC15558h, C16458j.w(aVar4 != null ? aVar4.a() : null), this.placeholderMemoryCacheKey, this.placeholderResId, this.placeholderDrawable, this.errorResId, this.errorDrawable, this.fallbackResId, this.fallbackDrawable, new C15368d(this.lifecycle, this.sizeResolver, this.scale, this.interceptorDispatcher, this.fetcherDispatcher, this.decoderDispatcher, this.transformationDispatcher, this.transitionFactory, this.precision, this.bitmapConfig, this.allowHardware, this.allowRgb565, this.memoryCachePolicy, this.diskCachePolicy, this.networkCachePolicy), this.defaults, null);
        }

        public final a d(int durationMillis) {
            InterfaceC16261c.a c2413a;
            if (durationMillis > 0) {
                c2413a = new C16259a.C2413a(durationMillis, false, 2, null);
            } else {
                c2413a = InterfaceC16261c.a.f155497b;
            }
            D(c2413a);
            return this;
        }

        public final a e(boolean enable) {
            return d(enable ? 100 : 0);
        }

        public final a f(Object data) {
            this.data = data;
            return this;
        }

        public final a g(C15367c defaults) {
            this.defaults = defaults;
            t();
            return this;
        }

        public final a h(String key) {
            this.diskCacheKey = key;
            return this;
        }

        public final a i(EnumC15366b policy) {
            this.diskCachePolicy = policy;
            return this;
        }

        public final a l(b listener) {
            this.listener = listener;
            return this;
        }

        public final a m(InterfaceC14857c.Key key) {
            this.memoryCacheKey = key;
            return this;
        }

        public final a o(EnumC15366b policy) {
            this.memoryCachePolicy = policy;
            return this;
        }

        public final a q(InterfaceC14857c.Key key) {
            this.placeholderMemoryCacheKey = key;
            return this;
        }

        public final a s(EnumC15555e precision) {
            this.precision = precision;
            return this;
        }

        public final a y(EnumC15558h scale) {
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
            return A(C15561k.a(size));
        }

        @JvmOverloads
        public a(C15372h c15372h, Context context) {
            this.context = context;
            this.defaults = c15372h.getDefaults();
            this.data = c15372h.getData();
            this.target = c15372h.getTarget();
            this.listener = c15372h.getListener();
            this.memoryCacheKey = c15372h.getMemoryCacheKey();
            this.diskCacheKey = c15372h.getDiskCacheKey();
            this.bitmapConfig = c15372h.getDefined().getBitmapConfig();
            if (Build.VERSION.SDK_INT >= 26) {
                this.colorSpace = c15372h.getColorSpace();
            }
            this.precision = c15372h.getDefined().getPrecision();
            this.fetcherFactory = c15372h.w();
            this.decoderFactory = c15372h.getDecoderFactory();
            this.transformations = c15372h.O();
            this.transitionFactory = c15372h.getDefined().getTransitionFactory();
            this.headers = c15372h.getHeaders().k();
            this.tags = MapsKt.D(c15372h.getTags().a());
            this.allowConversionToBitmap = c15372h.getAllowConversionToBitmap();
            this.allowHardware = c15372h.getDefined().getAllowHardware();
            this.allowRgb565 = c15372h.getDefined().getAllowRgb565();
            this.premultipliedAlpha = c15372h.getPremultipliedAlpha();
            this.memoryCachePolicy = c15372h.getDefined().getMemoryCachePolicy();
            this.diskCachePolicy = c15372h.getDefined().getDiskCachePolicy();
            this.networkCachePolicy = c15372h.getDefined().getNetworkCachePolicy();
            this.interceptorDispatcher = c15372h.getDefined().getInterceptorDispatcher();
            this.fetcherDispatcher = c15372h.getDefined().getFetcherDispatcher();
            this.decoderDispatcher = c15372h.getDefined().getDecoderDispatcher();
            this.transformationDispatcher = c15372h.getDefined().getTransformationDispatcher();
            this.parameters = c15372h.getParameters().h();
            this.placeholderMemoryCacheKey = c15372h.getPlaceholderMemoryCacheKey();
            this.placeholderResId = c15372h.placeholderResId;
            this.placeholderDrawable = c15372h.placeholderDrawable;
            this.errorResId = c15372h.errorResId;
            this.errorDrawable = c15372h.errorDrawable;
            this.fallbackResId = c15372h.fallbackResId;
            this.fallbackDrawable = c15372h.fallbackDrawable;
            this.lifecycle = c15372h.getDefined().getLifecycle();
            this.sizeResolver = c15372h.getDefined().getSizeResolver();
            this.scale = c15372h.getDefined().getScale();
            if (c15372h.getContext() == context) {
                this.resolvedLifecycle = c15372h.getLifecycle();
                this.resolvedSizeResolver = c15372h.getSizeResolver();
                this.resolvedScale = c15372h.getScale();
            } else {
                this.resolvedLifecycle = null;
                this.resolvedSizeResolver = null;
                this.resolvedScale = null;
            }
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0007\u0010\u0006J\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0017¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\fH\u0017¢\u0006\u0004\b\r\u0010\u000eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Ll5/h$b;", "", "Ll5/h;", "request", "", "d", "(Ll5/h;)V", "a", "Ll5/f;", "result", "c", "(Ll5/h;Ll5/f;)V", "Ll5/p;", "b", "(Ll5/h;Ll5/p;)V", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: l5.h$b */
    public interface b {
        default void a(C15372h request) {
        }

        default void b(C15372h request, C15380p result) {
        }

        default void c(C15372h request, C15370f result) {
        }

        default void d(C15372h request) {
        }
    }

    public /* synthetic */ C15372h(Context context, Object obj, InterfaceC15779c interfaceC15779c, b bVar, InterfaceC14857c.Key key, String str, Bitmap.Config config, ColorSpace colorSpace, EnumC15555e enumC15555e, Pair pair, InterfaceC6364j.a aVar, List list, InterfaceC16261c.a aVar2, Headers headers, Tags tags, boolean z10, boolean z11, boolean z12, boolean z13, EnumC15366b enumC15366b, EnumC15366b enumC15366b2, EnumC15366b enumC15366b3, AbstractC16618K abstractC16618K, AbstractC16618K abstractC16618K2, AbstractC16618K abstractC16618K3, AbstractC16618K abstractC16618K4, AbstractC6023l abstractC6023l, InterfaceC15560j interfaceC15560j, EnumC15558h enumC15558h, Parameters parameters, InterfaceC14857c.Key key2, Integer num, Drawable drawable, Integer num2, Drawable drawable2, Integer num3, Drawable drawable3, C15368d c15368d, C15367c c15367c, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, obj, interfaceC15779c, bVar, key, str, config, colorSpace, enumC15555e, pair, aVar, list, aVar2, headers, tags, z10, z11, z12, z13, enumC15366b, enumC15366b2, enumC15366b3, abstractC16618K, abstractC16618K2, abstractC16618K3, abstractC16618K4, abstractC6023l, interfaceC15560j, enumC15558h, parameters, key2, num, drawable, num2, drawable2, num3, drawable3, c15368d, c15367c);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C15372h)) {
            return false;
        }
        C15372h c15372h = (C15372h) other;
        if (Intrinsics.e(this.context, c15372h.context) && Intrinsics.e(this.data, c15372h.data) && Intrinsics.e(this.target, c15372h.target) && Intrinsics.e(this.listener, c15372h.listener) && Intrinsics.e(this.memoryCacheKey, c15372h.memoryCacheKey) && Intrinsics.e(this.diskCacheKey, c15372h.diskCacheKey) && this.bitmapConfig == c15372h.bitmapConfig) {
            return (Build.VERSION.SDK_INT < 26 || Intrinsics.e(this.colorSpace, c15372h.colorSpace)) && this.precision == c15372h.precision && Intrinsics.e(this.fetcherFactory, c15372h.fetcherFactory) && Intrinsics.e(this.decoderFactory, c15372h.decoderFactory) && Intrinsics.e(this.transformations, c15372h.transformations) && Intrinsics.e(this.transitionFactory, c15372h.transitionFactory) && Intrinsics.e(this.headers, c15372h.headers) && Intrinsics.e(this.tags, c15372h.tags) && this.allowConversionToBitmap == c15372h.allowConversionToBitmap && this.allowHardware == c15372h.allowHardware && this.allowRgb565 == c15372h.allowRgb565 && this.premultipliedAlpha == c15372h.premultipliedAlpha && this.memoryCachePolicy == c15372h.memoryCachePolicy && this.diskCachePolicy == c15372h.diskCachePolicy && this.networkCachePolicy == c15372h.networkCachePolicy && Intrinsics.e(this.interceptorDispatcher, c15372h.interceptorDispatcher) && Intrinsics.e(this.fetcherDispatcher, c15372h.fetcherDispatcher) && Intrinsics.e(this.decoderDispatcher, c15372h.decoderDispatcher) && Intrinsics.e(this.transformationDispatcher, c15372h.transformationDispatcher) && Intrinsics.e(this.placeholderMemoryCacheKey, c15372h.placeholderMemoryCacheKey) && Intrinsics.e(this.placeholderResId, c15372h.placeholderResId) && Intrinsics.e(this.placeholderDrawable, c15372h.placeholderDrawable) && Intrinsics.e(this.errorResId, c15372h.errorResId) && Intrinsics.e(this.errorDrawable, c15372h.errorDrawable) && Intrinsics.e(this.fallbackResId, c15372h.fallbackResId) && Intrinsics.e(this.fallbackDrawable, c15372h.fallbackDrawable) && Intrinsics.e(this.lifecycle, c15372h.lifecycle) && Intrinsics.e(this.sizeResolver, c15372h.sizeResolver) && this.scale == c15372h.scale && Intrinsics.e(this.parameters, c15372h.parameters) && Intrinsics.e(this.defined, c15372h.defined) && Intrinsics.e(this.defaults, c15372h.defaults);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C15372h(Context context, Object obj, InterfaceC15779c interfaceC15779c, b bVar, InterfaceC14857c.Key key, String str, Bitmap.Config config, ColorSpace colorSpace, EnumC15555e enumC15555e, Pair<? extends i.a<?>, ? extends Class<?>> pair, InterfaceC6364j.a aVar, List<? extends InterfaceC15996a> list, InterfaceC16261c.a aVar2, Headers headers, Tags tags, boolean z10, boolean z11, boolean z12, boolean z13, EnumC15366b enumC15366b, EnumC15366b enumC15366b2, EnumC15366b enumC15366b3, AbstractC16618K abstractC16618K, AbstractC16618K abstractC16618K2, AbstractC16618K abstractC16618K3, AbstractC16618K abstractC16618K4, AbstractC6023l abstractC6023l, InterfaceC15560j interfaceC15560j, EnumC15558h enumC15558h, Parameters parameters, InterfaceC14857c.Key key2, Integer num, Drawable drawable, Integer num2, Drawable drawable2, Integer num3, Drawable drawable3, C15368d c15368d, C15367c c15367c) {
        this.context = context;
        this.data = obj;
        this.target = interfaceC15779c;
        this.listener = bVar;
        this.memoryCacheKey = key;
        this.diskCacheKey = str;
        this.bitmapConfig = config;
        this.colorSpace = colorSpace;
        this.precision = enumC15555e;
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
        this.memoryCachePolicy = enumC15366b;
        this.diskCachePolicy = enumC15366b2;
        this.networkCachePolicy = enumC15366b3;
        this.interceptorDispatcher = abstractC16618K;
        this.fetcherDispatcher = abstractC16618K2;
        this.decoderDispatcher = abstractC16618K3;
        this.transformationDispatcher = abstractC16618K4;
        this.lifecycle = abstractC6023l;
        this.sizeResolver = interfaceC15560j;
        this.scale = enumC15558h;
        this.parameters = parameters;
        this.placeholderMemoryCacheKey = key2;
        this.placeholderResId = num;
        this.placeholderDrawable = drawable;
        this.errorResId = num2;
        this.errorDrawable = drawable2;
        this.fallbackResId = num3;
        this.fallbackDrawable = drawable3;
        this.defined = c15368d;
        this.defaults = c15367c;
    }

    public static /* synthetic */ a R(C15372h c15372h, Context context, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            context = c15372h.context;
        }
        return c15372h.Q(context);
    }

    /* renamed from: A, reason: from getter */
    public final b getListener() {
        return this.listener;
    }

    /* renamed from: B, reason: from getter */
    public final InterfaceC14857c.Key getMemoryCacheKey() {
        return this.memoryCacheKey;
    }

    /* renamed from: C, reason: from getter */
    public final EnumC15366b getMemoryCachePolicy() {
        return this.memoryCachePolicy;
    }

    /* renamed from: D, reason: from getter */
    public final EnumC15366b getNetworkCachePolicy() {
        return this.networkCachePolicy;
    }

    /* renamed from: E, reason: from getter */
    public final Parameters getParameters() {
        return this.parameters;
    }

    public final Drawable F() {
        return C16457i.c(this, this.placeholderDrawable, this.placeholderResId, this.defaults.getPlaceholder());
    }

    /* renamed from: G, reason: from getter */
    public final InterfaceC14857c.Key getPlaceholderMemoryCacheKey() {
        return this.placeholderMemoryCacheKey;
    }

    /* renamed from: H, reason: from getter */
    public final EnumC15555e getPrecision() {
        return this.precision;
    }

    /* renamed from: I, reason: from getter */
    public final boolean getPremultipliedAlpha() {
        return this.premultipliedAlpha;
    }

    /* renamed from: J, reason: from getter */
    public final EnumC15558h getScale() {
        return this.scale;
    }

    /* renamed from: K, reason: from getter */
    public final InterfaceC15560j getSizeResolver() {
        return this.sizeResolver;
    }

    /* renamed from: L, reason: from getter */
    public final Tags getTags() {
        return this.tags;
    }

    /* renamed from: M, reason: from getter */
    public final InterfaceC15779c getTarget() {
        return this.target;
    }

    /* renamed from: N, reason: from getter */
    public final AbstractC16618K getTransformationDispatcher() {
        return this.transformationDispatcher;
    }

    public final List<InterfaceC15996a> O() {
        return this.transformations;
    }

    /* renamed from: P, reason: from getter */
    public final InterfaceC16261c.a getTransitionFactory() {
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
        InterfaceC15779c interfaceC15779c = this.target;
        int iHashCode2 = (iHashCode + (interfaceC15779c != null ? interfaceC15779c.hashCode() : 0)) * 31;
        b bVar = this.listener;
        int iHashCode3 = (iHashCode2 + (bVar != null ? bVar.hashCode() : 0)) * 31;
        InterfaceC14857c.Key key = this.memoryCacheKey;
        int iHashCode4 = (iHashCode3 + (key != null ? key.hashCode() : 0)) * 31;
        String str = this.diskCacheKey;
        int iHashCode5 = (((iHashCode4 + (str != null ? str.hashCode() : 0)) * 31) + this.bitmapConfig.hashCode()) * 31;
        ColorSpace colorSpace = this.colorSpace;
        int iHashCode6 = (((iHashCode5 + (colorSpace != null ? colorSpace.hashCode() : 0)) * 31) + this.precision.hashCode()) * 31;
        Pair<i.a<?>, Class<?>> pair = this.fetcherFactory;
        int iHashCode7 = (iHashCode6 + (pair != null ? pair.hashCode() : 0)) * 31;
        InterfaceC6364j.a aVar = this.decoderFactory;
        int iHashCode8 = (((((((((((((((((((((((((((((((((((((((iHashCode7 + (aVar != null ? aVar.hashCode() : 0)) * 31) + this.transformations.hashCode()) * 31) + this.transitionFactory.hashCode()) * 31) + this.headers.hashCode()) * 31) + this.tags.hashCode()) * 31) + Boolean.hashCode(this.allowConversionToBitmap)) * 31) + Boolean.hashCode(this.allowHardware)) * 31) + Boolean.hashCode(this.allowRgb565)) * 31) + Boolean.hashCode(this.premultipliedAlpha)) * 31) + this.memoryCachePolicy.hashCode()) * 31) + this.diskCachePolicy.hashCode()) * 31) + this.networkCachePolicy.hashCode()) * 31) + this.interceptorDispatcher.hashCode()) * 31) + this.fetcherDispatcher.hashCode()) * 31) + this.decoderDispatcher.hashCode()) * 31) + this.transformationDispatcher.hashCode()) * 31) + this.lifecycle.hashCode()) * 31) + this.sizeResolver.hashCode()) * 31) + this.scale.hashCode()) * 31) + this.parameters.hashCode()) * 31;
        InterfaceC14857c.Key key2 = this.placeholderMemoryCacheKey;
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
    public final AbstractC16618K getDecoderDispatcher() {
        return this.decoderDispatcher;
    }

    /* renamed from: o, reason: from getter */
    public final InterfaceC6364j.a getDecoderFactory() {
        return this.decoderFactory;
    }

    /* renamed from: p, reason: from getter */
    public final C15367c getDefaults() {
        return this.defaults;
    }

    /* renamed from: q, reason: from getter */
    public final C15368d getDefined() {
        return this.defined;
    }

    /* renamed from: r, reason: from getter */
    public final String getDiskCacheKey() {
        return this.diskCacheKey;
    }

    /* renamed from: s, reason: from getter */
    public final EnumC15366b getDiskCachePolicy() {
        return this.diskCachePolicy;
    }

    public final Drawable t() {
        return C16457i.c(this, this.errorDrawable, this.errorResId, this.defaults.getError());
    }

    public final Drawable u() {
        return C16457i.c(this, this.fallbackDrawable, this.fallbackResId, this.defaults.getFallback());
    }

    /* renamed from: v, reason: from getter */
    public final AbstractC16618K getFetcherDispatcher() {
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
    public final AbstractC16618K getInterceptorDispatcher() {
        return this.interceptorDispatcher;
    }

    /* renamed from: z, reason: from getter */
    public final AbstractC6023l getLifecycle() {
        return this.lifecycle;
    }
}
