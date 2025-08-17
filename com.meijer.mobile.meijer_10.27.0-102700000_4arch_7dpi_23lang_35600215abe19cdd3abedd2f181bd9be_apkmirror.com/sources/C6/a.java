package C6;

import C6.f;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kw.InterfaceC15330g;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001f\u0010\u0007\u001a\u00020\u0001*\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004¢\u0006\u0004\b\u0007\u0010\b\u001a\u0019\u0010\n\u001a\b\u0018\u00010\u0006j\u0002`\t*\u00020\u0001H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u0013\u0010\f\u001a\u00020\u0006*\u00020\u0001H\u0002¢\u0006\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Lkw/g;", "LC6/f;", "c", "(Lkw/g;)LC6/f;", "", "", "", "b", "(Ljava/util/Map;)LC6/f;", "Lcom/apollographql/apollo/api/json/ApolloJsonElement;", "d", "(LC6/f;)Ljava/lang/Object;", "a", "apollo-api"}, k = 2, mv = {2, 0, 0}, xi = 48)
@JvmName
/* loaded from: classes4.dex */
public final class a {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: C6.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C0064a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[f.a.values().length];
            try {
                iArr[f.a.f3704j.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[f.a.f3703i.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[f.a.f3702h.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[f.a.f3701g.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[f.a.f3700f.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[f.a.f3697c.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[f.a.f3695a.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final f b(Map<String, ? extends Object> map) {
        Intrinsics.j(map, "<this>");
        return new h(map, null, 2, 0 == true ? 1 : 0);
    }

    public static final f c(InterfaceC15330g interfaceC15330g) {
        Intrinsics.j(interfaceC15330g, "<this>");
        return new d(interfaceC15330g);
    }

    public static final Object d(f fVar) {
        Intrinsics.j(fVar, "<this>");
        f.a peekedToken = fVar.getPeekedToken();
        switch (C0064a.$EnumSwitchMapping$0[peekedToken.ordinal()]) {
            case 1:
                return fVar.G2();
            case 2:
                return Boolean.valueOf(fVar.nextBoolean());
            case 3:
            case 4:
                return a(fVar);
            case 5:
                return fVar.nextString();
            case 6:
                fVar.s();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                while (fVar.hasNext()) {
                    linkedHashMap.put(fVar.nextName(), d(fVar));
                }
                fVar.F();
                return linkedHashMap;
            case 7:
                fVar.y();
                ArrayList arrayList = new ArrayList();
                while (fVar.hasNext()) {
                    arrayList.add(d(fVar));
                }
                fVar.x();
                return arrayList;
            default:
                throw new IllegalStateException(("unknown token " + peekedToken).toString());
        }
    }

    private static final Object a(f fVar) {
        try {
            try {
                try {
                    return Integer.valueOf(fVar.nextInt());
                } catch (Exception unused) {
                    return fVar.q3();
                }
            } catch (Exception unused2) {
                return Long.valueOf(fVar.nextLong());
            }
        } catch (Exception unused3) {
            return Double.valueOf(fVar.nextDouble());
        }
    }
}
