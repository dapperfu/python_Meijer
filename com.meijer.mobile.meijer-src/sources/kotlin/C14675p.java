package kotlin;

import Z.o0;
import Z.q0;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.libraries.places.api.model.PlaceTypes;
import io.constructor.data.local.PreferencesHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.C14672m;
import kotlin.C14674o;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u000f\b\u0016\u0018\u0000 i2\u00020\u0001:\u0002>CB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u0006¢\u0006\u0004\b\u0004\u0010\bJ5\u0010\u0011\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e0\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0005J\u0015\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\t¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0019\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001e\u001a\u00020\u001dH\u0017¢\u0006\u0004\b\u001f\u0010 J\u001b\u0010#\u001a\u00020\"2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b#\u0010$J!\u0010&\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010%H\u0007¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0010H\u0017¢\u0006\u0004\b(\u0010)J\u001f\u0010.\u001a\u00020\u00142\b\b\u0001\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b.\u0010/J\u001d\u00102\u001a\u00020\u00142\u0006\u00100\u001a\u00020\u00022\u0006\u00101\u001a\u00020\u000e¢\u0006\u0004\b2\u00103J\u001b\u00105\u001a\u0004\u0018\u00010%2\b\u00104\u001a\u0004\u0018\u00010%H\u0007¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\u0002H\u0016¢\u0006\u0004\b7\u00108J\u001a\u0010:\u001a\u00020\u00102\b\u00109\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020*H\u0016¢\u0006\u0004\b<\u0010=R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u00108R.\u0010I\u001a\u0004\u0018\u00010A2\b\u0010B\u001a\u0004\u0018\u00010A8\u0006@GX\u0086\u000e¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\u0018\u0010K\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010?R$\u0010S\u001a\u0004\u0018\u00010L8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\u001a\u0010W\u001a\b\u0012\u0004\u0012\u00020\t0T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u001a\u0010Z\u001a\b\u0012\u0004\u0012\u00020,0X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010YR\"\u0010^\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e0[8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010]R,\u0010_\u001a\u00020*2\b\b\u0001\u0010_\u001a\u00020*8G@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010`\u001a\u0004\ba\u0010=\"\u0004\bb\u0010cR.\u0010\u0019\u001a\u0004\u0018\u00010\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bd\u0010?\u001a\u0004\be\u00108\"\u0004\bf\u0010\u0005R\u0014\u0010h\u001a\u00020\u00028WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bg\u00108¨\u0006j"}, d2 = {"Li4/p;", "", "", "navigatorName", "<init>", "(Ljava/lang/String;)V", "Li4/B;", "navigator", "(Li4/B;)V", "Li4/m;", "deepLink", "Landroid/net/Uri;", "uri", "", "Li4/f;", "arguments", "", "v", "(Li4/m;Landroid/net/Uri;Ljava/util/Map;)Z", "uriPattern", "", "k", "navDeepLink", "h", "(Li4/m;)V", PlaceTypes.ROUTE, "Li4/p$b;", "y", "(Ljava/lang/String;)Li4/p$b;", "Li4/o;", "navDeepLinkRequest", "x", "(Li4/o;)Li4/p$b;", "previousDestination", "", "o", "(Li4/p;)[I", "Landroid/os/Bundle;", "w", "(Ljava/lang/String;Landroid/os/Bundle;)Z", "G", "()Z", "", "actionId", "Li4/e;", "action", "B", "(ILi4/e;)V", "argumentName", "argument", "f", "(Ljava/lang/String;Li4/f;)V", "args", "n", "(Landroid/os/Bundle;)Landroid/os/Bundle;", "toString", "()Ljava/lang/String;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "a", "Ljava/lang/String;", "s", "Li4/r;", "<set-?>", "b", "Li4/r;", "t", "()Li4/r;", "E", "(Li4/r;)V", "parent", "c", "idName", "", "d", "Ljava/lang/CharSequence;", "getLabel", "()Ljava/lang/CharSequence;", "D", "(Ljava/lang/CharSequence;)V", "label", "", "e", "Ljava/util/List;", "deepLinks", "LZ/o0;", "LZ/o0;", "actions", "", "g", "Ljava/util/Map;", "_arguments", PreferencesHelper.PREF_ID, "I", "r", "C", "(I)V", "i", "u", "F", "q", "displayName", "j", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: i4.p, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C14675p {

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: k, reason: collision with root package name */
    private static final Map<String, Class<?>> f137133k = new LinkedHashMap();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String navigatorName;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private C14677r parent;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private String idName;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private CharSequence label;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final List<C14672m> deepLinks;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final o0<C14664e> actions;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private Map<String, C14665f> _arguments;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private int id;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private String route;

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\f\u0010\rR$\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000f*\u00020\u000e8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R$\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\b\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00160\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Li4/p$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", PreferencesHelper.PREF_ID, "", "b", "(Landroid/content/Context;I)Ljava/lang/String;", PlaceTypes.ROUTE, "a", "(Ljava/lang/String;)Ljava/lang/String;", "Li4/p;", "Lkotlin/sequences/Sequence;", "c", "(Li4/p;)Lkotlin/sequences/Sequence;", "getHierarchy$annotations", "(Li4/p;)V", "hierarchy", "", "Ljava/lang/Class;", "classes", "Ljava/util/Map;", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: i4.p$a, reason: from kotlin metadata */
    public static final class Companion {

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Li4/p;", "it", "a", "(Li4/p;)Li4/p;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: i4.p$a$a, reason: collision with other inner class name */
        static final class C2165a extends Lambda implements Function1<C14675p, C14675p> {

            /* renamed from: f, reason: collision with root package name */
            public static final C2165a f137143f = new C2165a();

            C2165a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C14675p invoke(C14675p it) {
                Intrinsics.j(it, "it");
                return it.getParent();
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String a(String route) {
            if (route == null) {
                return "";
            }
            return "android-app://androidx.navigation/" + route;
        }

        @JvmStatic
        public final String b(Context context, int id2) throws Resources.NotFoundException {
            String strValueOf;
            Intrinsics.j(context, "context");
            if (id2 <= 16777215) {
                return String.valueOf(id2);
            }
            try {
                strValueOf = context.getResources().getResourceName(id2);
            } catch (Resources.NotFoundException unused) {
                strValueOf = String.valueOf(id2);
            }
            Intrinsics.i(strValueOf, "try {\n                co….toString()\n            }");
            return strValueOf;
        }

        public final Sequence<C14675p> c(C14675p c14675p) {
            Intrinsics.j(c14675p, "<this>");
            return SequencesKt.q(c14675p, C2165a.f137143f);
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0017\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\n\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001bR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001d¨\u0006\u001f"}, d2 = {"Li4/p$b;", "", "Li4/p;", "destination", "Landroid/os/Bundle;", "matchingArgs", "", "isExactDeepLink", "", "matchingPathSegments", "hasMatchingAction", "mimeTypeMatchLevel", "<init>", "(Li4/p;Landroid/os/Bundle;ZIZI)V", "other", "a", "(Li4/p$b;)I", "arguments", "l", "(Landroid/os/Bundle;)Z", "Li4/p;", "b", "()Li4/p;", "Landroid/os/Bundle;", "e", "()Landroid/os/Bundle;", "c", "Z", "d", "I", "f", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: i4.p$b */
    public static final class b implements Comparable<b> {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final C14675p destination;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Bundle matchingArgs;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final boolean isExactDeepLink;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final int matchingPathSegments;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final boolean hasMatchingAction;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final int mimeTypeMatchLevel;

        public final boolean l(Bundle arguments) {
            Bundle bundle;
            if (arguments == null || (bundle = this.matchingArgs) == null) {
                return false;
            }
            Set<String> setKeySet = bundle.keySet();
            Intrinsics.i(setKeySet, "matchingArgs.keySet()");
            for (String str : setKeySet) {
                if (!arguments.containsKey(str)) {
                    return false;
                }
                C14665f c14665f = (C14665f) this.destination._arguments.get(str);
                if (c14665f != null) {
                    c14665f.a();
                }
                if (!Intrinsics.e(null, null)) {
                    return false;
                }
            }
            return true;
        }

        public b(C14675p destination, Bundle bundle, boolean z10, int i10, boolean z11, int i11) {
            Intrinsics.j(destination, "destination");
            this.destination = destination;
            this.matchingArgs = bundle;
            this.isExactDeepLink = z10;
            this.matchingPathSegments = i10;
            this.hasMatchingAction = z11;
            this.mimeTypeMatchLevel = i11;
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(b other) {
            Intrinsics.j(other, "other");
            boolean z10 = this.isExactDeepLink;
            if (z10 && !other.isExactDeepLink) {
                return 1;
            }
            if (!z10 && other.isExactDeepLink) {
                return -1;
            }
            int i10 = this.matchingPathSegments - other.matchingPathSegments;
            if (i10 > 0) {
                return 1;
            }
            if (i10 < 0) {
                return -1;
            }
            Bundle bundle = this.matchingArgs;
            if (bundle != null && other.matchingArgs == null) {
                return 1;
            }
            if (bundle == null && other.matchingArgs != null) {
                return -1;
            }
            if (bundle != null) {
                int size = bundle.size();
                Bundle bundle2 = other.matchingArgs;
                Intrinsics.g(bundle2);
                int size2 = size - bundle2.size();
                if (size2 > 0) {
                    return 1;
                }
                if (size2 < 0) {
                    return -1;
                }
            }
            boolean z11 = this.hasMatchingAction;
            if (z11 && !other.hasMatchingAction) {
                return 1;
            }
            if (z11 || !other.hasMatchingAction) {
                return this.mimeTypeMatchLevel - other.mimeTypeMatchLevel;
            }
            return -1;
        }

        /* renamed from: b, reason: from getter */
        public final C14675p getDestination() {
            return this.destination;
        }

        /* renamed from: e, reason: from getter */
        public final Bundle getMatchingArgs() {
            return this.matchingArgs;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "key", "", "a", "(Ljava/lang/String;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: i4.p$c */
    static final class c extends Lambda implements Function1<String, Boolean> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C14672m f137150f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(C14672m c14672m) {
            super(1);
            this.f137150f = c14672m;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(String key) {
            Intrinsics.j(key, "key");
            return Boolean.valueOf(!this.f137150f.j().contains(key));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "key", "", "a", "(Ljava/lang/String;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: i4.p$d */
    static final class d extends Lambda implements Function1<String, Boolean> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Bundle f137151f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Bundle bundle) {
            super(1);
            this.f137151f = bundle;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(String key) {
            Intrinsics.j(key, "key");
            return Boolean.valueOf(!this.f137151f.containsKey(key));
        }
    }

    public C14675p(String navigatorName) {
        Intrinsics.j(navigatorName, "navigatorName");
        this.navigatorName = navigatorName;
        this.deepLinks = new ArrayList();
        this.actions = new o0<>();
        this._arguments = new LinkedHashMap();
    }

    public boolean G() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a0 A[EDGE_INSN: B:31:0x00a0->B:32:0x00a1 BREAK  A[LOOP:1: B:23:0x0071->B:47:?]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 1
            if (r8 != r9) goto L4
            return r0
        L4:
            r1 = 0
            if (r9 == 0) goto Lb8
            boolean r2 = r9 instanceof kotlin.C14675p
            if (r2 != 0) goto Ld
            goto Lb8
        Ld:
            java.util.List<i4.m> r2 = r8.deepLinks
            i4.p r9 = (kotlin.C14675p) r9
            java.util.List<i4.m> r3 = r9.deepLinks
            boolean r2 = kotlin.jvm.internal.Intrinsics.e(r2, r3)
            Z.o0<i4.e> r3 = r8.actions
            int r3 = r3.m()
            Z.o0<i4.e> r4 = r9.actions
            int r4 = r4.m()
            if (r3 != r4) goto L58
            Z.o0<i4.e> r3 = r8.actions
            kotlin.collections.IntIterator r3 = Z.q0.a(r3)
            kotlin.sequences.Sequence r3 = kotlin.sequences.SequencesKt.h(r3)
            java.util.Iterator r3 = r3.iterator()
        L33:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L56
            java.lang.Object r4 = r3.next()
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            Z.o0<i4.e> r5 = r8.actions
            java.lang.Object r5 = r5.e(r4)
            Z.o0<i4.e> r6 = r9.actions
            java.lang.Object r4 = r6.e(r4)
            boolean r4 = kotlin.jvm.internal.Intrinsics.e(r5, r4)
            if (r4 != 0) goto L33
            goto L58
        L56:
            r3 = r0
            goto L59
        L58:
            r3 = r1
        L59:
            java.util.Map<java.lang.String, i4.f> r4 = r8._arguments
            int r4 = r4.size()
            java.util.Map<java.lang.String, i4.f> r5 = r9._arguments
            int r5 = r5.size()
            if (r4 != r5) goto La0
            java.util.Map<java.lang.String, i4.f> r4 = r8._arguments
            kotlin.sequences.Sequence r4 = kotlin.collections.MapsKt.E(r4)
            java.util.Iterator r4 = r4.iterator()
        L71:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L9e
            java.lang.Object r5 = r4.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.util.Map<java.lang.String, i4.f> r6 = r9._arguments
            java.lang.Object r7 = r5.getKey()
            boolean r6 = r6.containsKey(r7)
            if (r6 == 0) goto La0
            java.util.Map<java.lang.String, i4.f> r6 = r9._arguments
            java.lang.Object r7 = r5.getKey()
            java.lang.Object r6 = r6.get(r7)
            java.lang.Object r5 = r5.getValue()
            boolean r5 = kotlin.jvm.internal.Intrinsics.e(r6, r5)
            if (r5 == 0) goto La0
            goto L71
        L9e:
            r4 = r0
            goto La1
        La0:
            r4 = r1
        La1:
            int r5 = r8.id
            int r6 = r9.id
            if (r5 != r6) goto Lb8
            java.lang.String r5 = r8.route
            java.lang.String r9 = r9.route
            boolean r9 = kotlin.jvm.internal.Intrinsics.e(r5, r9)
            if (r9 == 0) goto Lb8
            if (r2 == 0) goto Lb8
            if (r3 == 0) goto Lb8
            if (r4 == 0) goto Lb8
            return r0
        Lb8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C14675p.equals(java.lang.Object):boolean");
    }

    public final Bundle n(Bundle args) {
        Map<String, C14665f> map;
        if (args == null && ((map = this._arguments) == null || map.isEmpty())) {
            return null;
        }
        Bundle bundle = new Bundle();
        for (Map.Entry<String, C14665f> entry : this._arguments.entrySet()) {
            entry.getValue().d(entry.getKey(), bundle);
        }
        if (args != null) {
            bundle.putAll(args);
            for (Map.Entry<String, C14665f> entry2 : this._arguments.entrySet()) {
                String key = entry2.getKey();
                C14665f value = entry2.getValue();
                if (!value.e(key, bundle)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Wrong argument type for '");
                    sb2.append(key);
                    sb2.append("' in argument bundle. ");
                    value.a();
                    throw null;
                }
            }
        }
        return bundle;
    }

    public static /* synthetic */ int[] p(C14675p c14675p, C14675p c14675p2, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: buildDeepLinkIds");
        }
        if ((i10 & 1) != 0) {
            c14675p2 = null;
        }
        return c14675p.o(c14675p2);
    }

    public final void B(int actionId, C14664e action) {
        Intrinsics.j(action, "action");
        if (G()) {
            if (actionId == 0) {
                throw new IllegalArgumentException("Cannot have an action with actionId 0");
            }
            this.actions.j(actionId, action);
        } else {
            throw new UnsupportedOperationException("Cannot add action " + actionId + " to " + this + " as it does not support actions, indicating that it is a terminal destination in your navigation graph and will never trigger actions.");
        }
    }

    public final void C(int i10) {
        this.id = i10;
        this.idName = null;
    }

    public final void D(CharSequence charSequence) {
        this.label = charSequence;
    }

    public final void E(C14677r c14677r) {
        this.parent = c14677r;
    }

    public final void F(String str) {
        Object next;
        if (str == null) {
            C(0);
        } else {
            if (StringsKt.s0(str)) {
                throw new IllegalArgumentException("Cannot have an empty route");
            }
            String strA = INSTANCE.a(str);
            C(strA.hashCode());
            k(strA);
        }
        List<C14672m> list = this.deepLinks;
        List<C14672m> list2 = list;
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (Intrinsics.e(((C14672m) next).getUriPattern(), INSTANCE.a(this.route))) {
                    break;
                }
            }
        }
        TypeIntrinsics.a(list2).remove(next);
        this.route = str;
    }

    public final void f(String argumentName, C14665f argument) {
        Intrinsics.j(argumentName, "argumentName");
        Intrinsics.j(argument, "argument");
        this._arguments.put(argumentName, argument);
    }

    public final void h(C14672m navDeepLink) {
        Intrinsics.j(navDeepLink, "navDeepLink");
        List<String> listA = C14666g.a(this._arguments, new c(navDeepLink));
        if (listA.isEmpty()) {
            this.deepLinks.add(navDeepLink);
            return;
        }
        throw new IllegalArgumentException(("Deep link " + navDeepLink.getUriPattern() + " can't be used to open destination " + this + ".\nFollowing required arguments are missing: " + listA).toString());
    }

    public int hashCode() {
        Set<String> setKeySet;
        int i10 = this.id * 31;
        String str = this.route;
        int iHashCode = i10 + (str != null ? str.hashCode() : 0);
        for (C14672m c14672m : this.deepLinks) {
            int i11 = iHashCode * 31;
            String strY = c14672m.getUriPattern();
            int iHashCode2 = (i11 + (strY != null ? strY.hashCode() : 0)) * 31;
            String strI = c14672m.getAction();
            int iHashCode3 = (iHashCode2 + (strI != null ? strI.hashCode() : 0)) * 31;
            String strT = c14672m.getMimeType();
            iHashCode = iHashCode3 + (strT != null ? strT.hashCode() : 0);
        }
        Iterator itB = q0.b(this.actions);
        while (itB.hasNext()) {
            C14664e c14664e = (C14664e) itB.next();
            int iB = ((iHashCode * 31) + c14664e.getDestinationId()) * 31;
            C14682w c14682wC = c14664e.getNavOptions();
            iHashCode = iB + (c14682wC != null ? c14682wC.hashCode() : 0);
            Bundle bundleA = c14664e.getDefaultArguments();
            if (bundleA != null && (setKeySet = bundleA.keySet()) != null) {
                Intrinsics.i(setKeySet, "keySet()");
                for (String str2 : setKeySet) {
                    int i12 = iHashCode * 31;
                    Bundle bundleA2 = c14664e.getDefaultArguments();
                    Intrinsics.g(bundleA2);
                    Object obj = bundleA2.get(str2);
                    iHashCode = i12 + (obj != null ? obj.hashCode() : 0);
                }
            }
        }
        for (String str3 : this._arguments.keySet()) {
            int iHashCode4 = ((iHashCode * 31) + str3.hashCode()) * 31;
            C14665f c14665f = this._arguments.get(str3);
            iHashCode = iHashCode4 + (c14665f != null ? c14665f.hashCode() : 0);
        }
        return iHashCode;
    }

    public final void k(String uriPattern) {
        Intrinsics.j(uriPattern, "uriPattern");
        h(new C14672m.a().b(uriPattern).a());
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    @kotlin.jvm.JvmOverloads
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int[] o(kotlin.C14675p r6) {
        /*
            r5 = this;
            kotlin.collections.ArrayDeque r0 = new kotlin.collections.ArrayDeque
            r0.<init>()
            r1 = r5
        L6:
            kotlin.jvm.internal.Intrinsics.g(r1)
            i4.r r2 = r1.parent
            if (r6 == 0) goto L10
            i4.r r3 = r6.parent
            goto L11
        L10:
            r3 = 0
        L11:
            if (r3 == 0) goto L24
            i4.r r3 = r6.parent
            kotlin.jvm.internal.Intrinsics.g(r3)
            int r4 = r1.id
            i4.p r3 = r3.K(r4)
            if (r3 != r1) goto L24
            r0.addFirst(r1)
            goto L3a
        L24:
            if (r2 == 0) goto L2e
            int r3 = r2.getStartDestId()
            int r4 = r1.id
            if (r3 == r4) goto L31
        L2e:
            r0.addFirst(r1)
        L31:
            boolean r1 = kotlin.jvm.internal.Intrinsics.e(r2, r6)
            if (r1 == 0) goto L38
            goto L3a
        L38:
            if (r2 != 0) goto L6a
        L3a:
            java.util.List r6 = kotlin.collections.CollectionsKt.j1(r0)
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = kotlin.collections.CollectionsKt.x(r6, r1)
            r0.<init>(r1)
            java.util.Iterator r6 = r6.iterator()
        L4f:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L65
            java.lang.Object r1 = r6.next()
            i4.p r1 = (kotlin.C14675p) r1
            int r1 = r1.id
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
            goto L4f
        L65:
            int[] r6 = kotlin.collections.CollectionsKt.i1(r0)
            return r6
        L6a:
            r1 = r2
            goto L6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C14675p.o(i4.p):int[]");
    }

    public String q() {
        String str = this.idName;
        return str == null ? String.valueOf(this.id) : str;
    }

    /* renamed from: r, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: s, reason: from getter */
    public final String getNavigatorName() {
        return this.navigatorName;
    }

    /* renamed from: t, reason: from getter */
    public final C14677r getParent() {
        return this.parent;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append("(");
        String str = this.idName;
        if (str == null) {
            sb2.append("0x");
            sb2.append(Integer.toHexString(this.id));
        } else {
            sb2.append(str);
        }
        sb2.append(")");
        String str2 = this.route;
        if (str2 != null && !StringsKt.s0(str2)) {
            sb2.append(" route=");
            sb2.append(this.route);
        }
        if (this.label != null) {
            sb2.append(" label=");
            sb2.append(this.label);
        }
        String string = sb2.toString();
        Intrinsics.i(string, "sb.toString()");
        return string;
    }

    /* renamed from: u, reason: from getter */
    public final String getRoute() {
        return this.route;
    }

    public final boolean w(String route, Bundle arguments) {
        Intrinsics.j(route, "route");
        if (Intrinsics.e(this.route, route)) {
            return true;
        }
        b bVarY = y(route);
        if (Intrinsics.e(this, bVarY != null ? bVarY.getDestination() : null)) {
            return bVarY.l(arguments);
        }
        return false;
    }

    public b x(C14674o navDeepLinkRequest) {
        Intrinsics.j(navDeepLinkRequest, "navDeepLinkRequest");
        if (this.deepLinks.isEmpty()) {
            return null;
        }
        b bVar = null;
        for (C14672m c14672m : this.deepLinks) {
            Uri uriC = navDeepLinkRequest.getUri();
            Bundle bundleO = uriC != null ? c14672m.o(uriC, this._arguments) : null;
            int iH = c14672m.h(uriC);
            String strA = navDeepLinkRequest.getAction();
            boolean z10 = strA != null && Intrinsics.e(strA, c14672m.getAction());
            String strB = navDeepLinkRequest.getMimeType();
            int iU = strB != null ? c14672m.u(strB) : -1;
            if (bundleO == null) {
                if (z10 || iU > -1) {
                    if (v(c14672m, uriC, this._arguments)) {
                    }
                }
            }
            b bVar2 = new b(this, bundleO, c14672m.getIsExactDeepLink(), iH, z10, iU);
            if (bVar == null || bVar2.compareTo(bVar) > 0) {
                bVar = bVar2;
            }
        }
        return bVar;
    }

    public final b y(String route) {
        Intrinsics.j(route, "route");
        C14674o.a.Companion c2164a = C14674o.a.INSTANCE;
        Uri uri = Uri.parse(INSTANCE.a(route));
        Intrinsics.f(uri, "Uri.parse(this)");
        C14674o c14674oA = c2164a.a(uri).a();
        return this instanceof C14677r ? ((C14677r) this).T(c14674oA) : x(c14674oA);
    }

    private final boolean v(C14672m deepLink, Uri uri, Map<String, C14665f> arguments) {
        return C14666g.a(arguments, new d(deepLink.p(uri, arguments))).isEmpty();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C14675p(AbstractC14656B<? extends C14675p> navigator) {
        this(C14657C.INSTANCE.a(navigator.getClass()));
        Intrinsics.j(navigator, "navigator");
    }
}
