package defpackage;

import com.squareup.wire.ProtoAdapter;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import lu.c;
import lu.q;
import lu.r;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u0000 \n2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0000\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"La;", "Llu/r;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "I", "getValue", "()I", "b", "d", "e", "f", "g", "h", "i", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class a implements r {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE;

    /* renamed from: c, reason: collision with root package name */
    @JvmField
    public static final ProtoAdapter<a> f43330c;

    /* renamed from: d, reason: collision with root package name */
    public static final a f43331d;

    /* renamed from: e, reason: collision with root package name */
    public static final a f43332e;

    /* renamed from: f, reason: collision with root package name */
    public static final a f43333f;

    /* renamed from: g, reason: collision with root package name */
    public static final a f43334g;

    /* renamed from: h, reason: collision with root package name */
    public static final a f43335h;

    /* renamed from: i, reason: collision with root package name */
    public static final a f43336i;

    /* renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ a[] f43337j;

    /* renamed from: k, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f43338k;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int value;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"La$b;", "", "<init>", "()V", "", "value", "La;", "(I)La;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: a$b, reason: from kotlin metadata */
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final a a(int value) {
            if (value == 0) {
                return a.f43331d;
            }
            if (value == 1) {
                return a.f43332e;
            }
            if (value == 2) {
                return a.f43333f;
            }
            if (value == 3) {
                return a.f43334g;
            }
            if (value == 4) {
                return a.f43335h;
            }
            if (value != 5) {
                return null;
            }
            return a.f43336i;
        }
    }

    private static final /* synthetic */ a[] a() {
        return new a[]{f43331d, f43332e, f43333f, f43334g, f43335h, f43336i};
    }

    static {
        a aVar = new a("ARM32", 0, 0);
        f43331d = aVar;
        f43332e = new a("ARM64", 1, 1);
        f43333f = new a("X86", 2, 2);
        f43334g = new a("X86_64", 3, 3);
        f43335h = new a("RISCV64", 4, 4);
        f43336i = new a("NONE", 5, 5);
        a[] aVarArrA = a();
        f43337j = aVarArrA;
        f43338k = EnumEntriesKt.a(aVarArrA);
        INSTANCE = new Companion(null);
        f43330c = new c<a>(Reflection.b(a.class), q.f149440d, aVar) { // from class: a.a
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // lu.c
            /* renamed from: q, reason: merged with bridge method [inline-methods] */
            public a p(int value) {
                return a.INSTANCE.a(value);
            }
        };
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f43337j.clone();
    }

    @Override // lu.r
    public int getValue() {
        return this.value;
    }

    private a(String str, int i10, int i11) {
        this.value = i11;
    }
}
