package androidx.compose.ui.text.input;

import com.fullstory.instrumentation.frameworks.compose.FSComposeKeyboardTypeCompanion;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087@\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\u0005J\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/text/input/KeyboardType;", "", "", "value", "l", "(I)I", "", "p", "(I)Ljava/lang/String;", "o", "other", "", "m", "(ILjava/lang/Object;)Z", "a", "I", "Companion", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
/* loaded from: classes.dex */
public final class KeyboardType {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int value;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: b, reason: collision with root package name */
    private static final int f52717b = l(0);
    private static final int Text = l(1);
    private static final int Ascii = l(2);
    private static final int Number = l(3);
    private static final int Phone = l(4);
    private static final int Uri = l(5);
    private static final int Email = l(6);
    private static final int Password = l(7);
    private static final int NumberPassword = l(8);
    private static final int Decimal = l(9);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b!\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R&\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\bR&\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\n\u0010\u0006\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\u000b\u0010\bR&\u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\r\u0010\u0006\u0012\u0004\b\u000f\u0010\u0003\u001a\u0004\b\u000e\u0010\bR&\u0010\u0010\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0010\u0010\u0006\u0012\u0004\b\u0012\u0010\u0003\u001a\u0004\b\u0011\u0010\bR&\u0010\u0013\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0013\u0010\u0006\u0012\u0004\b\u0015\u0010\u0003\u001a\u0004\b\u0014\u0010\bR&\u0010\u0016\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0016\u0010\u0006\u0012\u0004\b\u0018\u0010\u0003\u001a\u0004\b\u0017\u0010\bR&\u0010\u0019\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0019\u0010\u0006\u0012\u0004\b\u001b\u0010\u0003\u001a\u0004\b\u001a\u0010\bR&\u0010\u001c\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001c\u0010\u0006\u0012\u0004\b\u001e\u0010\u0003\u001a\u0004\b\u001d\u0010\bR&\u0010\u001f\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001f\u0010\u0006\u0012\u0004\b!\u0010\u0003\u001a\u0004\b \u0010\bR&\u0010\"\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\"\u0010\u0006\u0012\u0004\b$\u0010\u0003\u001a\u0004\b#\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006%"}, d2 = {"Landroidx/compose/ui/text/input/KeyboardType$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/text/input/KeyboardType;", "Unspecified", "I", "i", "()I", "getUnspecified-PjHm6EE$annotations", "Text", "h", "getText-PjHm6EE$annotations", "Ascii", "a", "getAscii-PjHm6EE$annotations", "Number", "d", "getNumber-PjHm6EE$annotations", "Phone", "g", "getPhone-PjHm6EE$annotations", "Uri", "j", "getUri-PjHm6EE$annotations", "Email", "c", "getEmail-PjHm6EE$annotations", "Password", "f", "getPassword-PjHm6EE$annotations", "NumberPassword", "e", "getNumberPassword-PjHm6EE$annotations", "Decimal", "b", "getDecimal-PjHm6EE$annotations", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion implements FSComposeKeyboardTypeCompanion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.fullstory.instrumentation.frameworks.compose.FSComposeKeyboardTypeCompanion
        public final Integer _fsGetAscii() {
            return Integer.valueOf(KeyboardType._fsGetAscii());
        }

        @Override // com.fullstory.instrumentation.frameworks.compose.FSComposeKeyboardTypeCompanion
        public final Integer _fsGetDecimal() {
            return Integer.valueOf(KeyboardType._fsGetDecimal());
        }

        @Override // com.fullstory.instrumentation.frameworks.compose.FSComposeKeyboardTypeCompanion
        public final Integer _fsGetEmail() {
            return Integer.valueOf(KeyboardType._fsGetEmail());
        }

        @Override // com.fullstory.instrumentation.frameworks.compose.FSComposeKeyboardTypeCompanion
        public final Integer _fsGetNumber() {
            return Integer.valueOf(KeyboardType._fsGetNumber());
        }

        @Override // com.fullstory.instrumentation.frameworks.compose.FSComposeKeyboardTypeCompanion
        public final Integer _fsGetNumberPassword() {
            return Integer.valueOf(KeyboardType._fsGetNumberPassword());
        }

        @Override // com.fullstory.instrumentation.frameworks.compose.FSComposeKeyboardTypeCompanion
        public final Integer _fsGetPassword() {
            return Integer.valueOf(KeyboardType._fsGetPassword());
        }

        @Override // com.fullstory.instrumentation.frameworks.compose.FSComposeKeyboardTypeCompanion
        public final Integer _fsGetPhone() {
            return Integer.valueOf(KeyboardType._fsGetPhone());
        }

        @Override // com.fullstory.instrumentation.frameworks.compose.FSComposeKeyboardTypeCompanion
        public final Integer _fsGetText() {
            return Integer.valueOf(KeyboardType._fsGetText());
        }

        @Override // com.fullstory.instrumentation.frameworks.compose.FSComposeKeyboardTypeCompanion
        public final Integer _fsGetUri() {
            return Integer.valueOf(KeyboardType._fsGetUri());
        }

        private Companion() {
        }

        public final int a() {
            return KeyboardType.Ascii;
        }

        public final int b() {
            return KeyboardType.Decimal;
        }

        public final int c() {
            return KeyboardType.Email;
        }

        public final int d() {
            return KeyboardType.Number;
        }

        public final int e() {
            return KeyboardType.NumberPassword;
        }

        public final int f() {
            return KeyboardType.Password;
        }

        public final int g() {
            return KeyboardType.Phone;
        }

        public final int h() {
            return KeyboardType.Text;
        }

        public final int i() {
            return KeyboardType.f52717b;
        }

        public final int j() {
            return KeyboardType.Uri;
        }
    }

    public static final int _fsGetAscii() {
        return Ascii;
    }

    public static final int _fsGetDecimal() {
        return Decimal;
    }

    public static final int _fsGetEmail() {
        return Email;
    }

    public static final int _fsGetNumber() {
        return Number;
    }

    public static final int _fsGetNumberPassword() {
        return NumberPassword;
    }

    public static final int _fsGetPassword() {
        return Password;
    }

    public static final int _fsGetPhone() {
        return Phone;
    }

    public static final int _fsGetText() {
        return Text;
    }

    public static final int _fsGetUri() {
        return Uri;
    }

    public static final /* synthetic */ KeyboardType k(int i10) {
        return new KeyboardType(i10);
    }

    private static int l(int i10) {
        return i10;
    }

    public static boolean m(int i10, Object obj) {
        return (obj instanceof KeyboardType) && i10 == ((KeyboardType) obj).getValue();
    }

    public static final boolean n(int i10, int i11) {
        return i10 == i11;
    }

    public static int o(int i10) {
        return Integer.hashCode(i10);
    }

    public boolean equals(Object obj) {
        return m(this.value, obj);
    }

    public int hashCode() {
        return o(this.value);
    }

    /* renamed from: q, reason: from getter */
    public final /* synthetic */ int getValue() {
        return this.value;
    }

    public static String p(int i10) {
        return n(i10, f52717b) ? "Unspecified" : n(i10, Text) ? "Text" : n(i10, Ascii) ? "Ascii" : n(i10, Number) ? "Number" : n(i10, Phone) ? "Phone" : n(i10, Uri) ? "Uri" : n(i10, Email) ? "Email" : n(i10, Password) ? "Password" : n(i10, NumberPassword) ? "NumberPassword" : n(i10, Decimal) ? "Decimal" : "Invalid";
    }

    public String toString() {
        return p(this.value);
    }

    private /* synthetic */ KeyboardType(int i10) {
        this.value = i10;
    }
}
