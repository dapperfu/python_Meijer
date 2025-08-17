package kotlin.time;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0001¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0017\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\u000b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lkotlin/time/DurationUnit;", "", "f", "(Lkotlin/time/DurationUnit;)Ljava/lang/String;", "shortName", "e", "(Ljava/lang/String;)Lkotlin/time/DurationUnit;", "", "isoChar", "", "isTimeComponent", "d", "(CZ)Lkotlin/time/DurationUnit;", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/time/DurationUnitKt")
/* loaded from: classes13.dex */
class DurationUnitKt__DurationUnitKt extends DurationUnitKt__DurationUnitJvmKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DurationUnit.values().length];
            try {
                iArr[DurationUnit.f147506b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DurationUnit.f147507c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DurationUnit.f147508d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DurationUnit.f147509e.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DurationUnit.f147510f.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[DurationUnit.f147511g.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[DurationUnit.f147512h.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @SinceKotlin
    public static final DurationUnit d(char c10, boolean z10) {
        if (!z10) {
            if (c10 == 'D') {
                return DurationUnit.f147512h;
            }
            throw new IllegalArgumentException("Invalid or unsupported duration ISO non-time unit: " + c10);
        }
        if (c10 == 'H') {
            return DurationUnit.f147511g;
        }
        if (c10 == 'M') {
            return DurationUnit.f147510f;
        }
        if (c10 == 'S') {
            return DurationUnit.f147509e;
        }
        throw new IllegalArgumentException("Invalid duration ISO time unit: " + c10);
    }

    @SinceKotlin
    public static final DurationUnit e(String shortName) {
        Intrinsics.j(shortName, "shortName");
        int iHashCode = shortName.hashCode();
        if (iHashCode != 100) {
            if (iHashCode != 104) {
                if (iHashCode != 109) {
                    if (iHashCode != 115) {
                        if (iHashCode != 3494) {
                            if (iHashCode != 3525) {
                                if (iHashCode == 3742 && shortName.equals("us")) {
                                    return DurationUnit.f147507c;
                                }
                            } else if (shortName.equals("ns")) {
                                return DurationUnit.f147506b;
                            }
                        } else if (shortName.equals("ms")) {
                            return DurationUnit.f147508d;
                        }
                    } else if (shortName.equals("s")) {
                        return DurationUnit.f147509e;
                    }
                } else if (shortName.equals("m")) {
                    return DurationUnit.f147510f;
                }
            } else if (shortName.equals("h")) {
                return DurationUnit.f147511g;
            }
        } else if (shortName.equals("d")) {
            return DurationUnit.f147512h;
        }
        throw new IllegalArgumentException("Unknown duration unit short name: " + shortName);
    }

    @SinceKotlin
    public static final String f(DurationUnit durationUnit) {
        Intrinsics.j(durationUnit, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[durationUnit.ordinal()]) {
            case 1:
                return "ns";
            case 2:
                return "us";
            case 3:
                return "ms";
            case 4:
                return "s";
            case 5:
                return "m";
            case 6:
                return "h";
            case 7:
                return "d";
            default:
                throw new IllegalStateException(("Unknown unit: " + durationUnit).toString());
        }
    }
}
