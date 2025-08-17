package zi;

import com.google.android.gms.common.api.a;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u001a'\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001d\u0010\t\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lzi/g1;", "", "", "proposedValue", "", "b", "(Lzi/g1;Ljava/lang/String;)V", "proposedStringFromInputDevice", "currentValue", "a", "(Ljava/lang/String;Ljava/lang/Number;)Ljava/lang/String;", "library_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: zi.i1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C18495i1 {
    public static final String a(String proposedStringFromInputDevice, Number currentValue) {
        Intrinsics.j(proposedStringFromInputDevice, "proposedStringFromInputDevice");
        Intrinsics.j(currentValue, "currentValue");
        try {
            if (!(currentValue instanceof Double)) {
                if (!(currentValue instanceof Integer)) {
                    return currentValue.toString();
                }
                if (StringsKt.r0(proposedStringFromInputDevice)) {
                    return "0";
                }
                for (int i10 = 0; i10 < proposedStringFromInputDevice.length(); i10++) {
                    if (!Character.isDigit(proposedStringFromInputDevice.charAt(i10))) {
                        return String.valueOf(currentValue.intValue());
                    }
                }
                return proposedStringFromInputDevice;
            }
            if (StringsKt.r0(proposedStringFromInputDevice)) {
                return "0.0";
            }
            for (int i11 = 0; i11 < proposedStringFromInputDevice.length(); i11++) {
                char cCharAt = proposedStringFromInputDevice.charAt(i11);
                if (!Character.isDigit(cCharAt) && cCharAt != '.') {
                    return String.valueOf(currentValue.doubleValue());
                }
            }
            int i12 = 0;
            for (int i13 = 0; i13 < proposedStringFromInputDevice.length(); i13++) {
                if (proposedStringFromInputDevice.charAt(i13) == '.') {
                    i12++;
                }
            }
            if (i12 >= 2) {
                return String.valueOf(currentValue.doubleValue());
            }
            for (int i14 = 0; i14 < proposedStringFromInputDevice.length(); i14++) {
                if (!Character.isDigit(proposedStringFromInputDevice.charAt(i14))) {
                    if (StringsKt.W(proposedStringFromInputDevice, ".", false, 2, null) && !StringsKt.G(proposedStringFromInputDevice, ".", false, 2, null)) {
                        return '0' + proposedStringFromInputDevice;
                    }
                    if (StringsKt.W(proposedStringFromInputDevice, ".", false, 2, null) && StringsKt.G(proposedStringFromInputDevice, ".", false, 2, null)) {
                        return "0.0";
                    }
                    if (StringsKt.W(proposedStringFromInputDevice, ".", false, 2, null) || !StringsKt.G(proposedStringFromInputDevice, ".", false, 2, null)) {
                        return (StringsKt.W(proposedStringFromInputDevice, ".", false, 2, null) || StringsKt.G(proposedStringFromInputDevice, ".", false, 2, null)) ? String.valueOf(currentValue.doubleValue()) : proposedStringFromInputDevice;
                    }
                    return proposedStringFromInputDevice + '0';
                }
            }
            return proposedStringFromInputDevice + ".0";
        } catch (Throwable unused) {
            return currentValue.toString();
        }
    }

    @Deprecated
    public static final void b(InterfaceC18489g1<Number, Number> interfaceC18489g1, String proposedValue) {
        Number value;
        String value2;
        Intrinsics.j(interfaceC18489g1, "<this>");
        Intrinsics.j(proposedValue, "proposedValue");
        Number value3 = interfaceC18489g1.getValue();
        int i10 = 0;
        if (value3 instanceof Integer) {
            if (interfaceC18489g1.getValue().intValue() == -1) {
                proposedValue = StringsKt.Q(proposedValue, "-1", "", false, 4, null);
            }
            StringBuilder sb2 = new StringBuilder();
            int length = proposedValue.length();
            for (int i11 = 0; i11 < length; i11++) {
                char cCharAt = proposedValue.charAt(i11);
                if (Character.isDigit(cCharAt)) {
                    sb2.append(cCharAt);
                }
            }
            String string = sb2.toString();
            if (!StringsKt.r0(string)) {
                int length2 = string.length();
                i10 = a.e.API_PRIORITY_OTHER;
                if (length2 <= 10 && (string.length() <= 9 || Long.parseLong(string) <= 2147483647L)) {
                    i10 = Integer.parseInt(string);
                }
            }
            value = Integer.valueOf(i10);
        } else if (value3 instanceof Double) {
            Regex regex = new Regex("\\d{1,3}\\.\\d{0,2}");
            int i12 = 0;
            for (int i13 = 0; i13 < proposedValue.length(); i13++) {
                if (proposedValue.charAt(i13) == '.') {
                    i12++;
                }
            }
            if (i12 > 1) {
                String strS = StringsKt.S(proposedValue, ".", "", false, 4, null);
                StringsKt.P0(proposedValue, ".", "", null, 4, null);
                double d10 = Double.parseDouble(strS);
                if (!Intrinsics.e(Double.valueOf(d10), interfaceC18489g1.getValue())) {
                    String.valueOf(d10);
                }
            }
            MatchResult matchResultD = Regex.d(regex, (i12 >= 1 || !Intrinsics.e(StringsKt.Q(interfaceC18489g1.getValue().toString(), ".", "", false, 4, null), proposedValue)) ? proposedValue : String.valueOf(interfaceC18489g1.getValue()), 0, 2, null);
            value = Double.valueOf((matchResultD == null || (value2 = matchResultD.getValue()) == null) ? 0.0d : Double.parseDouble(value2));
        } else {
            value = interfaceC18489g1.getValue();
        }
        interfaceC18489g1.A().invoke(value, interfaceC18489g1.getValue());
    }
}
