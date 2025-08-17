package Ik;

import Hk.Validation;
import Hk.c;
import java.lang.CharSequence;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty0;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u0011*\n\b\u0000\u0010\u0002*\u0004\u0018\u00010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u0013B%\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"LIk/b;", "", "T", "LIk/k;", "Lkotlin/reflect/KProperty0;", "LHk/b;", "field", "", "fieldName", "<init>", "(Lkotlin/reflect/KProperty0;Ljava/lang/String;)V", "", "LHk/c;", "d", "()Ljava/util/List;", "f", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "a", "util_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class b<T extends CharSequence> extends k<T> {

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: h, reason: collision with root package name */
    private static final Pattern f14080h;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final String fieldName;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LIk/b$a;", "", "<init>", "()V", "Ljava/util/regex/Pattern;", "EMAIL_ADDRESS", "Ljava/util/regex/Pattern;", "a", "()Ljava/util/regex/Pattern;", "util_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Ik.b$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Pattern a() {
            return b.f14080h;
        }
    }

    public /* synthetic */ b(KProperty0 kProperty0, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(kProperty0, (i10 & 2) != 0 ? kProperty0.getName() : str);
    }

    static {
        Pattern patternCompile = Pattern.compile("^(?!.*\\.\\.)(\"[^\"]{1,256}\"|[a-zA-Z0-9._%+-]{1,256})@[a-zA-Z0-9.-]{1,64}\\.(?!-)[a-zA-Z-]{1,62}[a-zA-Z]$");
        Intrinsics.i(patternCompile, "compile(...)");
        f14080h = patternCompile;
    }

    @Override // Ik.k
    public List<Hk.c> d() {
        T tI;
        return (f14080h.matcher(String.valueOf(i())).matches() || (tI = i()) == null || StringsKt.r0(tI)) ? CollectionsKt.m() : CollectionsKt.e(new c.Invalid(getFieldName(), null, "format not supported", 2, null));
    }

    @Override // Ik.k
    /* renamed from: g, reason: from getter */
    public String getFieldName() {
        return this.fieldName;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(KProperty0<Validation<T>> field, String fieldName) {
        super(field, null, 2, 0 == true ? 1 : 0);
        Intrinsics.j(field, "field");
        Intrinsics.j(fieldName, "fieldName");
        this.fieldName = fieldName;
    }
}
