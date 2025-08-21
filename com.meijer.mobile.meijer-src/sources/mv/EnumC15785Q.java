package mv;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function2;
import sv.C17168a;
import sv.C17169b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J[\u0010\u000e\u001a\u00020\r\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u00052'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006¢\u0006\u0002\b\t2\u0006\u0010\u000b\u001a\u00028\u00002\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007H\u0087\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0015\u001a\u00020\u00108FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012j\u0002\b\u0016j\u0002\b\u000ej\u0002\b\u0017j\u0002\b\u0018¨\u0006\u0019"}, d2 = {"Lmv/Q;", "", "<init>", "(Ljava/lang/String;I)V", "R", "T", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "receiver", "completion", "", "b", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)V", "", "e", "()Z", "isLazy$annotations", "()V", "isLazy", "a", "c", "d", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: mv.Q, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class EnumC15785Q {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC15785Q f151685a = new EnumC15785Q("DEFAULT", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC15785Q f151686b = new EnumC15785Q("LAZY", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC15785Q f151687c = new EnumC15785Q("ATOMIC", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC15785Q f151688d = new EnumC15785Q("UNDISPATCHED", 3);

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumC15785Q[] f151689e;

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f151690f;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: mv.Q$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC15785Q.values().length];
            try {
                iArr[EnumC15785Q.f151685a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC15785Q.f151687c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC15785Q.f151688d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC15785Q.f151686b.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        EnumC15785Q[] enumC15785QArrA = a();
        f151689e = enumC15785QArrA;
        f151690f = EnumEntriesKt.a(enumC15785QArrA);
    }

    private static final /* synthetic */ EnumC15785Q[] a() {
        return new EnumC15785Q[]{f151685a, f151686b, f151687c, f151688d};
    }

    public static EnumC15785Q valueOf(String str) {
        return (EnumC15785Q) Enum.valueOf(EnumC15785Q.class, str);
    }

    public static EnumC15785Q[] values() {
        return (EnumC15785Q[]) f151689e.clone();
    }

    public final <R, T> void b(Function2<? super R, ? super Continuation<? super T>, ? extends Object> block, R receiver, Continuation<? super T> completion) {
        int i10 = a.$EnumSwitchMapping$0[ordinal()];
        if (i10 == 1) {
            C17168a.c(block, receiver, completion);
            return;
        }
        if (i10 == 2) {
            ContinuationKt.b(block, receiver, completion);
        } else if (i10 == 3) {
            C17169b.c(block, receiver, completion);
        } else if (i10 != 4) {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final boolean e() {
        return this == f151686b;
    }

    private EnumC15785Q(String str, int i10) {
    }
}
