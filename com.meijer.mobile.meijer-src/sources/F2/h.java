package F2;

import B2.D;
import E2.f;
import E2.g;
import E2.h;
import F2.f;
import androidx.datastore.core.CorruptionException;
import androidx.datastore.preferences.protobuf.AbstractC6083g;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016H\u0096@¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"LF2/h;", "LB2/D;", "LF2/f;", "<init>", "()V", "", "value", "LE2/h;", "f", "(Ljava/lang/Object;)LE2/h;", "", "name", "LF2/c;", "mutablePreferences", "", "d", "(Ljava/lang/String;LE2/h;LF2/c;)V", "Ljava/io/InputStream;", "input", "c", "(Ljava/io/InputStream;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "t", "Ljava/io/OutputStream;", "output", "g", "(LF2/f;Ljava/io/OutputStream;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "e", "()LF2/f;", "defaultValue", "datastore-preferences-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class h implements D<f> {

    /* renamed from: a, reason: collision with root package name */
    public static final h f8998a = new h();

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[h.b.values().length];
            try {
                iArr[h.b.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[h.b.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[h.b.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[h.b.INTEGER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[h.b.LONG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[h.b.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[h.b.STRING_SET.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[h.b.BYTES.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[h.b.VALUE_NOT_SET.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final E2.h f(Object value) {
        if (value instanceof Boolean) {
            E2.h hVarBuild = E2.h.n0().z(((Boolean) value).booleanValue()).build();
            Intrinsics.i(hVarBuild, "newBuilder().setBoolean(value).build()");
            return hVarBuild;
        }
        if (value instanceof Float) {
            E2.h hVarBuild2 = E2.h.n0().D(((Number) value).floatValue()).build();
            Intrinsics.i(hVarBuild2, "newBuilder().setFloat(value).build()");
            return hVarBuild2;
        }
        if (value instanceof Double) {
            E2.h hVarBuild3 = E2.h.n0().C(((Number) value).doubleValue()).build();
            Intrinsics.i(hVarBuild3, "newBuilder().setDouble(value).build()");
            return hVarBuild3;
        }
        if (value instanceof Integer) {
            E2.h hVarBuild4 = E2.h.n0().E(((Number) value).intValue()).build();
            Intrinsics.i(hVarBuild4, "newBuilder().setInteger(value).build()");
            return hVarBuild4;
        }
        if (value instanceof Long) {
            E2.h hVarBuild5 = E2.h.n0().F(((Number) value).longValue()).build();
            Intrinsics.i(hVarBuild5, "newBuilder().setLong(value).build()");
            return hVarBuild5;
        }
        if (value instanceof String) {
            E2.h hVarBuild6 = E2.h.n0().G((String) value).build();
            Intrinsics.i(hVarBuild6, "newBuilder().setString(value).build()");
            return hVarBuild6;
        }
        if (value instanceof Set) {
            h.a aVarN0 = E2.h.n0();
            g.a aVarA0 = E2.g.a0();
            Intrinsics.h(value, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
            E2.h hVarBuild7 = aVarN0.H(aVarA0.z((Set) value)).build();
            Intrinsics.i(hVarBuild7, "newBuilder()\n           …                 .build()");
            return hVarBuild7;
        }
        if (value instanceof byte[]) {
            E2.h hVarBuild8 = E2.h.n0().A(AbstractC6083g.k((byte[]) value)).build();
            Intrinsics.i(hVarBuild8, "newBuilder().setBytes(By….copyFrom(value)).build()");
            return hVarBuild8;
        }
        throw new IllegalStateException("PreferencesSerializer does not support type: " + value.getClass().getName());
    }

    @Override // B2.D
    public Object c(InputStream inputStream, Continuation<? super f> continuation) throws IOException {
        E2.f fVarA = E2.d.INSTANCE.a(inputStream);
        c cVarB = g.b(new f.b[0]);
        Map<String, E2.h> mapX = fVarA.X();
        Intrinsics.i(mapX, "preferencesProto.preferencesMap");
        for (Map.Entry<String, E2.h> entry : mapX.entrySet()) {
            String name = entry.getKey();
            E2.h value = entry.getValue();
            h hVar = f8998a;
            Intrinsics.i(name, "name");
            Intrinsics.i(value, "value");
            hVar.d(name, value, cVarB);
        }
        return cVarB.d();
    }

    private h() {
    }

    private final void d(String name, E2.h value, c mutablePreferences) throws CorruptionException {
        int i10;
        h.b bVarM0 = value.m0();
        if (bVarM0 == null) {
            i10 = -1;
        } else {
            i10 = a.$EnumSwitchMapping$0[bVarM0.ordinal()];
        }
        switch (i10) {
            case -1:
                throw new CorruptionException("Value case is null.", null, 2, null);
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                mutablePreferences.i(i.a(name), Boolean.valueOf(value.d0()));
                return;
            case 2:
                mutablePreferences.i(i.d(name), Float.valueOf(value.h0()));
                return;
            case 3:
                mutablePreferences.i(i.c(name), Double.valueOf(value.g0()));
                return;
            case 4:
                mutablePreferences.i(i.e(name), Integer.valueOf(value.i0()));
                return;
            case 5:
                mutablePreferences.i(i.f(name), Long.valueOf(value.j0()));
                return;
            case 6:
                f.a<String> aVarG = i.g(name);
                String strK0 = value.k0();
                Intrinsics.i(strK0, "value.string");
                mutablePreferences.i(aVarG, strK0);
                return;
            case 7:
                f.a<Set<String>> aVarH = i.h(name);
                List<String> listZ = value.l0().Z();
                Intrinsics.i(listZ, "value.stringSet.stringsList");
                mutablePreferences.i(aVarH, CollectionsKt.o1(listZ));
                return;
            case 8:
                f.a<byte[]> aVarB = i.b(name);
                byte[] bArrV = value.e0().v();
                Intrinsics.i(bArrV, "value.bytes.toByteArray()");
                mutablePreferences.i(aVarB, bArrV);
                return;
            case 9:
                throw new CorruptionException("Value not set.", null, 2, null);
        }
    }

    @Override // B2.D
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public f a() {
        return g.a();
    }

    @Override // B2.D
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public Object b(f fVar, OutputStream outputStream, Continuation<? super Unit> continuation) throws IOException {
        Map<f.a<?>, Object> mapA = fVar.a();
        f.a aVarA0 = E2.f.a0();
        for (Map.Entry<f.a<?>, Object> entry : mapA.entrySet()) {
            aVarA0.z(entry.getKey().getName(), f(entry.getValue()));
        }
        aVarA0.build().p(outputStream);
        return Unit.f143329a;
    }
}
