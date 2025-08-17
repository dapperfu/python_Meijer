package V4;

import N4.C4316d;
import N4.E;
import N4.EnumC4313a;
import N4.EnumC4334w;
import N4.N;
import W4.NetworkRequestCompat;
import W4.u;
import W4.z;
import android.net.NetworkRequest;
import android.net.Uri;
import android.os.Build;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010\"\u001a\u00020!2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0007¢\u0006\u0004\b\"\u0010#J\u001d\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010$\u001a\u00020!H\u0007¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020'2\u0006\u0010$\u001a\u00020!H\u0001¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020!2\u0006\u0010*\u001a\u00020'H\u0001¢\u0006\u0004\b+\u0010,¨\u0006-"}, d2 = {"LV4/s;", "", "<init>", "()V", "LN4/N$c;", "state", "", "k", "(LN4/N$c;)I", "value", "g", "(I)LN4/N$c;", "LN4/a;", "backoffPolicy", "a", "(LN4/a;)I", "d", "(I)LN4/a;", "LN4/w;", "networkType", "h", "(LN4/w;)I", "e", "(I)LN4/w;", "LN4/E;", "policy", "i", "(LN4/E;)I", "f", "(I)LN4/E;", "", "LN4/d$c;", "triggers", "", "j", "(Ljava/util/Set;)[B", "bytes", "b", "([B)Ljava/util/Set;", "LW4/y;", "l", "([B)LW4/y;", "requestCompat", "c", "(LW4/y;)[B", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public static final s f36906a = new s();

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[N.c.values().length];
            try {
                iArr[N.c.ENQUEUED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[N.c.RUNNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[N.c.SUCCEEDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[N.c.FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[N.c.BLOCKED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[N.c.CANCELLED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[EnumC4313a.values().length];
            try {
                iArr2[EnumC4313a.EXPONENTIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[EnumC4313a.LINEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[EnumC4334w.values().length];
            try {
                iArr3[EnumC4334w.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[EnumC4334w.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[EnumC4334w.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[EnumC4334w.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[EnumC4334w.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[E.values().length];
            try {
                iArr4[E.RUN_AS_NON_EXPEDITED_WORK_REQUEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr4[E.DROP_WORK_REQUEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    @JvmStatic
    public static final int a(EnumC4313a backoffPolicy) {
        Intrinsics.j(backoffPolicy, "backoffPolicy");
        int i10 = a.$EnumSwitchMapping$1[backoffPolicy.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        throw new NoWhenBranchMatchedException();
    }

    @JvmStatic
    public static final Set<C4316d.c> b(byte[] bytes) {
        ObjectInputStream objectInputStream;
        Intrinsics.j(bytes, "bytes");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (bytes.length == 0) {
            return linkedHashSet;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        try {
            try {
                objectInputStream = new ObjectInputStream(byteArrayInputStream);
            } catch (IOException e10) {
                e10.printStackTrace();
            }
            try {
                int i10 = objectInputStream.readInt();
                for (int i11 = 0; i11 < i10; i11++) {
                    Uri uri = Uri.parse(objectInputStream.readUTF());
                    boolean z10 = objectInputStream.readBoolean();
                    Intrinsics.i(uri, "uri");
                    linkedHashSet.add(new C4316d.c(uri, z10));
                }
                Unit unit = Unit.f142422a;
                CloseableKt.a(objectInputStream, null);
                Unit unit2 = Unit.f142422a;
                CloseableKt.a(byteArrayInputStream, null);
                return linkedHashSet;
            } finally {
            }
        } finally {
        }
    }

    @JvmStatic
    public static final byte[] c(NetworkRequestCompat requestCompat) {
        Intrinsics.j(requestCompat, "requestCompat");
        if (Build.VERSION.SDK_INT < 28) {
            return new byte[0];
        }
        NetworkRequest networkRequestB = requestCompat.b();
        if (networkRequestB == null) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                int[] iArrC = z.c(networkRequestB);
                int[] iArrB = z.b(networkRequestB);
                objectOutputStream.writeInt(iArrC.length);
                for (int i10 : iArrC) {
                    objectOutputStream.writeInt(i10);
                }
                objectOutputStream.writeInt(iArrB.length);
                for (int i11 : iArrB) {
                    objectOutputStream.writeInt(i11);
                }
                Unit unit = Unit.f142422a;
                CloseableKt.a(objectOutputStream, null);
                CloseableKt.a(byteArrayOutputStream, null);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                Intrinsics.i(byteArray, "outputStream.toByteArray()");
                return byteArray;
            } finally {
            }
        } finally {
        }
    }

    @JvmStatic
    public static final EnumC4313a d(int value) {
        if (value == 0) {
            return EnumC4313a.EXPONENTIAL;
        }
        if (value == 1) {
            return EnumC4313a.LINEAR;
        }
        throw new IllegalArgumentException("Could not convert " + value + " to BackoffPolicy");
    }

    @JvmStatic
    public static final EnumC4334w e(int value) {
        if (value == 0) {
            return EnumC4334w.NOT_REQUIRED;
        }
        if (value == 1) {
            return EnumC4334w.CONNECTED;
        }
        if (value == 2) {
            return EnumC4334w.UNMETERED;
        }
        if (value == 3) {
            return EnumC4334w.NOT_ROAMING;
        }
        if (value == 4) {
            return EnumC4334w.METERED;
        }
        if (Build.VERSION.SDK_INT >= 30 && value == 5) {
            return EnumC4334w.TEMPORARILY_UNMETERED;
        }
        throw new IllegalArgumentException("Could not convert " + value + " to NetworkType");
    }

    @JvmStatic
    public static final E f(int value) {
        if (value == 0) {
            return E.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        }
        if (value == 1) {
            return E.DROP_WORK_REQUEST;
        }
        throw new IllegalArgumentException("Could not convert " + value + " to OutOfQuotaPolicy");
    }

    @JvmStatic
    public static final N.c g(int value) {
        if (value == 0) {
            return N.c.ENQUEUED;
        }
        if (value == 1) {
            return N.c.RUNNING;
        }
        if (value == 2) {
            return N.c.SUCCEEDED;
        }
        if (value == 3) {
            return N.c.FAILED;
        }
        if (value == 4) {
            return N.c.BLOCKED;
        }
        if (value == 5) {
            return N.c.CANCELLED;
        }
        throw new IllegalArgumentException("Could not convert " + value + " to State");
    }

    @JvmStatic
    public static final int h(EnumC4334w networkType) {
        Intrinsics.j(networkType, "networkType");
        int i10 = a.$EnumSwitchMapping$2[networkType.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        if (i10 == 3) {
            return 2;
        }
        if (i10 == 4) {
            return 3;
        }
        if (i10 == 5) {
            return 4;
        }
        if (Build.VERSION.SDK_INT >= 30 && networkType == EnumC4334w.TEMPORARILY_UNMETERED) {
            return 5;
        }
        throw new IllegalArgumentException("Could not convert " + networkType + " to int");
    }

    @JvmStatic
    public static final int i(E policy) {
        Intrinsics.j(policy, "policy");
        int i10 = a.$EnumSwitchMapping$3[policy.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        throw new NoWhenBranchMatchedException();
    }

    @JvmStatic
    public static final byte[] j(Set<C4316d.c> triggers) {
        Intrinsics.j(triggers, "triggers");
        if (triggers.isEmpty()) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                objectOutputStream.writeInt(triggers.size());
                for (C4316d.c cVar : triggers) {
                    objectOutputStream.writeUTF(cVar.getUri().toString());
                    objectOutputStream.writeBoolean(cVar.getIsTriggeredForDescendants());
                }
                Unit unit = Unit.f142422a;
                CloseableKt.a(objectOutputStream, null);
                CloseableKt.a(byteArrayOutputStream, null);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                Intrinsics.i(byteArray, "outputStream.toByteArray()");
                return byteArray;
            } finally {
            }
        } finally {
        }
    }

    @JvmStatic
    public static final int k(N.c state) {
        Intrinsics.j(state, "state");
        switch (a.$EnumSwitchMapping$0[state.ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @JvmStatic
    public static final NetworkRequestCompat l(byte[] bytes) {
        Intrinsics.j(bytes, "bytes");
        if (Build.VERSION.SDK_INT < 28 || bytes.length == 0) {
            return new NetworkRequestCompat(null);
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            try {
                int i10 = objectInputStream.readInt();
                int[] iArr = new int[i10];
                for (int i11 = 0; i11 < i10; i11++) {
                    iArr[i11] = objectInputStream.readInt();
                }
                int i12 = objectInputStream.readInt();
                int[] iArr2 = new int[i12];
                for (int i13 = 0; i13 < i12; i13++) {
                    iArr2[i13] = objectInputStream.readInt();
                }
                NetworkRequestCompat networkRequestCompatB = u.f38532a.b(iArr2, iArr);
                CloseableKt.a(objectInputStream, null);
                CloseableKt.a(byteArrayInputStream, null);
                return networkRequestCompatB;
            } finally {
            }
        } finally {
        }
    }

    private s() {
    }
}
