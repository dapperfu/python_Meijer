package Ia;

import j$.net.URLEncoder;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\b\u000f\u0018\u0000 \u00142\u00020\u0001:\u0001\nB7\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR&\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\n\u0010\u0013¨\u0006\u0015"}, d2 = {"LIa/e;", "LIa/b;", "", "logicName", "", "data", "", "variants", "<init>", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/List;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Ljava/util/Map;", "getData", "()Ljava/util/Map;", "c", "Ljava/util/List;", "()Ljava/util/List;", "d", "predict-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e implements b {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String logicName;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Map<String, String> data;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final List<String> variants;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\u000b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0012\u001a\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0015\u0010\u0010J\u0017\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0017\u0010\u0010J\u0017\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0018\u0010\u0010J\u0017\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0019\u0010\u0010R\u0014\u0010\u001a\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\u001bR\u0014\u0010 \u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u001bR\u0014\u0010!\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\u001bR\u0014\u0010\"\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010\u001b¨\u0006#"}, d2 = {"LIa/e$a;", "", "<init>", "()V", "", "LIa/a;", "items", "", "d", "(Ljava/util/List;)Ljava/lang/String;", "cartItem", "c", "(LIa/a;)Ljava/lang/String;", "searchTerm", "LIa/b;", "h", "(Ljava/lang/String;)LIa/b;", "cartItems", "b", "(Ljava/util/List;)LIa/b;", "itemId", "g", "categoryPath", "e", "a", "f", "SEARCH", "Ljava/lang/String;", "CART", "RELATED", "CATEGORY", "ALSO_BOUGHT", "POPULAR", "PERSONAL", "HOME", "predict-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Ia.e$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private final String d(List<? extends a> items) {
            StringBuilder sb2 = new StringBuilder();
            int size = items.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (i10 != 0) {
                    sb2.append("|");
                }
                sb2.append(c(items.get(i10)));
            }
            String string = sb2.toString();
            Intrinsics.i(string, "toString(...)");
            return string;
        }

        @JvmStatic
        public final b a(String itemId) {
            Intrinsics.j(itemId, "itemId");
            return new e("ALSO_BOUGHT", MapsKt.g(TuplesKt.a("v", "i:" + URLEncoder.encode(itemId, Charsets.UTF_8))), CollectionsKt.m());
        }

        @JvmStatic
        public final b b(List<? extends a> cartItems) {
            Intrinsics.j(cartItems, "cartItems");
            return new e("CART", MapsKt.o(TuplesKt.a("cv", "1"), TuplesKt.a("ca", d(cartItems))), CollectionsKt.m());
        }

        @JvmStatic
        public final b e(String categoryPath) {
            Intrinsics.j(categoryPath, "categoryPath");
            return new e("CATEGORY", MapsKt.g(TuplesKt.a("vc", categoryPath)), CollectionsKt.m());
        }

        @JvmStatic
        public final b f(String categoryPath) {
            Intrinsics.j(categoryPath, "categoryPath");
            return new e("POPULAR", MapsKt.g(TuplesKt.a("vc", categoryPath)), CollectionsKt.m());
        }

        @JvmStatic
        public final b g(String itemId) {
            Intrinsics.j(itemId, "itemId");
            return new e("RELATED", MapsKt.g(TuplesKt.a("v", "i:" + URLEncoder.encode(itemId, Charsets.UTF_8))), CollectionsKt.m());
        }

        @JvmStatic
        public final b h(String searchTerm) {
            Intrinsics.j(searchTerm, "searchTerm");
            return new e("SEARCH", MapsKt.g(TuplesKt.a("q", searchTerm)), CollectionsKt.m());
        }

        private final String c(a cartItem) {
            Intrinsics.g(cartItem);
            return "i:" + URLEncoder.encode(cartItem.getItemId(), Charsets.UTF_8) + ",p:" + cartItem.l() + ",q:" + cartItem.getQuantity();
        }
    }

    public e(String logicName, Map<String, String> data, List<String> variants) {
        Intrinsics.j(logicName, "logicName");
        Intrinsics.j(data, "data");
        Intrinsics.j(variants, "variants");
        this.logicName = logicName;
        this.data = data;
        this.variants = variants;
    }

    @Override // Ia.b
    public List<String> a() {
        return this.variants;
    }

    @Override // Ia.b
    /* renamed from: b, reason: from getter */
    public String getLogicName() {
        return this.logicName;
    }

    @Override // Ia.b
    public Map<String, String> getData() {
        return this.data;
    }
}
