package kotlin.text;

import com.google.android.gms.common.api.a;
import kotlin.ExperimentalStdlibApi;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@SinceKotlin
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0004\u0018\u0019\u001a\u001bB!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0015\u001a\u0004\b\u0011\u0010\u0016¨\u0006\u001c"}, d2 = {"Lkotlin/text/HexFormat;", "", "", "upperCase", "Lkotlin/text/HexFormat$BytesHexFormat;", "bytes", "Lkotlin/text/HexFormat$NumberHexFormat;", "number", "<init>", "(ZLkotlin/text/HexFormat$BytesHexFormat;Lkotlin/text/HexFormat$NumberHexFormat;)V", "", "toString", "()Ljava/lang/String;", "a", "Z", "c", "()Z", "b", "Lkotlin/text/HexFormat$BytesHexFormat;", "getBytes", "()Lkotlin/text/HexFormat$BytesHexFormat;", "Lkotlin/text/HexFormat$NumberHexFormat;", "()Lkotlin/text/HexFormat$NumberHexFormat;", "d", "BytesHexFormat", "NumberHexFormat", "Builder", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
@ExperimentalStdlibApi
/* loaded from: classes14.dex */
public final class HexFormat {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: e, reason: collision with root package name */
    private static final HexFormat f148320e;

    /* renamed from: f, reason: collision with root package name */
    private static final HexFormat f148321f;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean upperCase;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final BytesHexFormat bytes;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final NumberHexFormat number;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u0000 (2\u00020\u0001:\u0002)*B9\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0012\u001a\u00060\u000ej\u0002`\u000f2\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000f2\u0006\u0010\u0011\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001c\u0010\rR\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u0019\u0010\rR\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u001d\u0010\rR\u001a\u0010\"\u001a\u00020\u001e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010$\u001a\u00020\u001e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001f\u001a\u0004\b#\u0010!R\u001a\u0010'\u001a\u00020\u001e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b%\u0010\u001f\u001a\u0004\b&\u0010!¨\u0006+"}, d2 = {"Lkotlin/text/HexFormat$BytesHexFormat;", "", "", "bytesPerLine", "bytesPerGroup", "", "groupSeparator", "byteSeparator", "bytePrefix", "byteSuffix", "<init>", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "sb", "indent", "b", "(Ljava/lang/StringBuilder;Ljava/lang/String;)Ljava/lang/StringBuilder;", "a", "I", "g", "()I", "f", "c", "Ljava/lang/String;", "h", "d", "e", "", "Z", "getNoLineAndGroupSeparator$kotlin_stdlib", "()Z", "noLineAndGroupSeparator", "getShortByteSeparatorNoPrefixAndSuffix$kotlin_stdlib", "shortByteSeparatorNoPrefixAndSuffix", "i", "getIgnoreCase$kotlin_stdlib", "ignoreCase", "j", "Builder", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BytesHexFormat {

        /* renamed from: j, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: k, reason: collision with root package name */
        private static final BytesHexFormat f148327k = new BytesHexFormat(a.e.API_PRIORITY_OTHER, a.e.API_PRIORITY_OTHER, "  ", "", "", "");

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int bytesPerLine;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int bytesPerGroup;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final String groupSeparator;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final String byteSeparator;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final String bytePrefix;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final String byteSuffix;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final boolean noLineAndGroupSeparator;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        private final boolean shortByteSeparatorNoPrefixAndSuffix;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        private final boolean ignoreCase;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lkotlin/text/HexFormat$BytesHexFormat$Companion;", "", "<init>", "()V", "Lkotlin/text/HexFormat$BytesHexFormat;", "Default", "Lkotlin/text/HexFormat$BytesHexFormat;", "a", "()Lkotlin/text/HexFormat$BytesHexFormat;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final BytesHexFormat a() {
                return BytesHexFormat.f148327k;
            }
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0014\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003R*\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR*\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0007\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR\"\u0010\u0018\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R*\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00118\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u001a\u0010\u0015\"\u0004\b\u001b\u0010\u0017R*\u0010 \u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00118\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0013\u001a\u0004\b\u001e\u0010\u0015\"\u0004\b\u001f\u0010\u0017R*\u0010$\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00118\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u0013\u001a\u0004\b\"\u0010\u0015\"\u0004\b#\u0010\u0017¨\u0006%"}, d2 = {"Lkotlin/text/HexFormat$BytesHexFormat$Builder;", "", "<init>", "()V", "", "value", "a", "I", "getBytesPerLine", "()I", "setBytesPerLine", "(I)V", "bytesPerLine", "b", "getBytesPerGroup", "setBytesPerGroup", "bytesPerGroup", "", "c", "Ljava/lang/String;", "getGroupSeparator", "()Ljava/lang/String;", "setGroupSeparator", "(Ljava/lang/String;)V", "groupSeparator", "d", "getByteSeparator", "setByteSeparator", "byteSeparator", "e", "getBytePrefix", "setBytePrefix", "bytePrefix", "f", "getByteSuffix", "setByteSuffix", "byteSuffix", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Builder {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private int bytesPerLine;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            private int bytesPerGroup;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata */
            private String groupSeparator;

            /* renamed from: d, reason: collision with root package name and from kotlin metadata */
            private String byteSeparator;

            /* renamed from: e, reason: collision with root package name and from kotlin metadata */
            private String bytePrefix;

            /* renamed from: f, reason: collision with root package name and from kotlin metadata */
            private String byteSuffix;

            public Builder() {
                Companion companion = BytesHexFormat.INSTANCE;
                this.bytesPerLine = companion.a().getBytesPerLine();
                this.bytesPerGroup = companion.a().getBytesPerGroup();
                this.groupSeparator = companion.a().getGroupSeparator();
                this.byteSeparator = companion.a().getByteSeparator();
                this.bytePrefix = companion.a().getBytePrefix();
                this.byteSuffix = companion.a().getByteSuffix();
            }
        }

        public BytesHexFormat(int i10, int i11, String groupSeparator, String byteSeparator, String bytePrefix, String byteSuffix) {
            Intrinsics.j(groupSeparator, "groupSeparator");
            Intrinsics.j(byteSeparator, "byteSeparator");
            Intrinsics.j(bytePrefix, "bytePrefix");
            Intrinsics.j(byteSuffix, "byteSuffix");
            this.bytesPerLine = i10;
            this.bytesPerGroup = i11;
            this.groupSeparator = groupSeparator;
            this.byteSeparator = byteSeparator;
            this.bytePrefix = bytePrefix;
            this.byteSuffix = byteSuffix;
            this.noLineAndGroupSeparator = i10 == Integer.MAX_VALUE && i11 == Integer.MAX_VALUE;
            this.shortByteSeparatorNoPrefixAndSuffix = bytePrefix.length() == 0 && byteSuffix.length() == 0 && byteSeparator.length() <= 1;
            this.ignoreCase = HexFormatKt.b(groupSeparator) || HexFormatKt.b(byteSeparator) || HexFormatKt.b(bytePrefix) || HexFormatKt.b(byteSuffix);
        }

        public final StringBuilder b(StringBuilder sb2, String indent) {
            Intrinsics.j(sb2, "sb");
            Intrinsics.j(indent, "indent");
            sb2.append(indent);
            sb2.append("bytesPerLine = ");
            sb2.append(this.bytesPerLine);
            sb2.append(",");
            sb2.append('\n');
            sb2.append(indent);
            sb2.append("bytesPerGroup = ");
            sb2.append(this.bytesPerGroup);
            sb2.append(",");
            sb2.append('\n');
            sb2.append(indent);
            sb2.append("groupSeparator = \"");
            sb2.append(this.groupSeparator);
            sb2.append("\",");
            sb2.append('\n');
            sb2.append(indent);
            sb2.append("byteSeparator = \"");
            sb2.append(this.byteSeparator);
            sb2.append("\",");
            sb2.append('\n');
            sb2.append(indent);
            sb2.append("bytePrefix = \"");
            sb2.append(this.bytePrefix);
            sb2.append("\",");
            sb2.append('\n');
            sb2.append(indent);
            sb2.append("byteSuffix = \"");
            sb2.append(this.byteSuffix);
            sb2.append("\"");
            return sb2;
        }

        /* renamed from: c, reason: from getter */
        public final String getBytePrefix() {
            return this.bytePrefix;
        }

        /* renamed from: d, reason: from getter */
        public final String getByteSeparator() {
            return this.byteSeparator;
        }

        /* renamed from: e, reason: from getter */
        public final String getByteSuffix() {
            return this.byteSuffix;
        }

        /* renamed from: f, reason: from getter */
        public final int getBytesPerGroup() {
            return this.bytesPerGroup;
        }

        /* renamed from: g, reason: from getter */
        public final int getBytesPerLine() {
            return this.bytesPerLine;
        }

        /* renamed from: h, reason: from getter */
        public final String getGroupSeparator() {
            return this.groupSeparator;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("BytesHexFormat(");
            sb2.append('\n');
            b(sb2, "    ").append('\n');
            sb2.append(")");
            return sb2.toString();
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lkotlin/text/HexFormat$Companion;", "", "<init>", "()V", "Lkotlin/text/HexFormat;", "Default", "Lkotlin/text/HexFormat;", "a", "()Lkotlin/text/HexFormat;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final HexFormat a() {
            return HexFormat.f148320e;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\u0018\u0000  2\u00020\u0001:\u0002%&B)\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0011\u001a\u00060\rj\u0002`\u000e2\n\u0010\u000f\u001a\u00060\rj\u0002`\u000e2\u0006\u0010\u0010\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0014\u001a\u0004\b\u0016\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001b\u0010\u001dR\u001a\u0010!\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0018\u001a\u0004\b \u0010\u001aR\u001a\u0010#\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\"\u0010\u001aR\u001a\u0010$\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0017\u0010\u001a¨\u0006'"}, d2 = {"Lkotlin/text/HexFormat$NumberHexFormat;", "", "", "prefix", "suffix", "", "removeLeadingZeros", "", "minLength", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZI)V", "toString", "()Ljava/lang/String;", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "sb", "indent", "b", "(Ljava/lang/StringBuilder;Ljava/lang/String;)Ljava/lang/StringBuilder;", "a", "Ljava/lang/String;", "e", "g", "c", "Z", "f", "()Z", "d", "I", "()I", "getMinLength$annotations", "()V", "h", "isDigitsOnly", "i", "isDigitsOnlyAndNoPadding", "ignoreCase", "Builder", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class NumberHexFormat {

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: i, reason: collision with root package name */
        private static final NumberHexFormat f148344i = new NumberHexFormat("", "", false, 1);

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String prefix;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final String suffix;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final boolean removeLeadingZeros;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final int minLength;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final boolean isDigitsOnly;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final boolean isDigitsOnlyAndNoPadding;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final boolean ignoreCase;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lkotlin/text/HexFormat$NumberHexFormat$Companion;", "", "<init>", "()V", "Lkotlin/text/HexFormat$NumberHexFormat;", "Default", "Lkotlin/text/HexFormat$NumberHexFormat;", "a", "()Lkotlin/text/HexFormat$NumberHexFormat;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final NumberHexFormat a() {
                return NumberHexFormat.f148344i;
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003R*\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR*\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0007\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR\"\u0010\u0018\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R0\u0010!\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00198\u0006@FX\u0087\u000e¢\u0006\u0018\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b \u0010\u0003\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Lkotlin/text/HexFormat$NumberHexFormat$Builder;", "", "<init>", "()V", "", "value", "a", "Ljava/lang/String;", "getPrefix", "()Ljava/lang/String;", "setPrefix", "(Ljava/lang/String;)V", "prefix", "b", "getSuffix", "setSuffix", "suffix", "", "c", "Z", "getRemoveLeadingZeros", "()Z", "setRemoveLeadingZeros", "(Z)V", "removeLeadingZeros", "", "d", "I", "getMinLength", "()I", "setMinLength", "(I)V", "getMinLength$annotations", "minLength", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        public static final class Builder {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private String prefix;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            private String suffix;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata */
            private boolean removeLeadingZeros;

            /* renamed from: d, reason: collision with root package name and from kotlin metadata */
            private int minLength;

            public Builder() {
                Companion companion = NumberHexFormat.INSTANCE;
                this.prefix = companion.a().getPrefix();
                this.suffix = companion.a().getSuffix();
                this.removeLeadingZeros = companion.a().getRemoveLeadingZeros();
                this.minLength = companion.a().getMinLength();
            }
        }

        public NumberHexFormat(String prefix, String suffix, boolean z10, int i10) {
            Intrinsics.j(prefix, "prefix");
            Intrinsics.j(suffix, "suffix");
            this.prefix = prefix;
            this.suffix = suffix;
            this.removeLeadingZeros = z10;
            this.minLength = i10;
            boolean z11 = prefix.length() == 0 && suffix.length() == 0;
            this.isDigitsOnly = z11;
            this.isDigitsOnlyAndNoPadding = z11 && i10 == 1;
            this.ignoreCase = HexFormatKt.b(prefix) || HexFormatKt.b(suffix);
        }

        public final StringBuilder b(StringBuilder sb2, String indent) {
            Intrinsics.j(sb2, "sb");
            Intrinsics.j(indent, "indent");
            sb2.append(indent);
            sb2.append("prefix = \"");
            sb2.append(this.prefix);
            sb2.append("\",");
            sb2.append('\n');
            sb2.append(indent);
            sb2.append("suffix = \"");
            sb2.append(this.suffix);
            sb2.append("\",");
            sb2.append('\n');
            sb2.append(indent);
            sb2.append("removeLeadingZeros = ");
            sb2.append(this.removeLeadingZeros);
            sb2.append(',');
            sb2.append('\n');
            sb2.append(indent);
            sb2.append("minLength = ");
            sb2.append(this.minLength);
            return sb2;
        }

        /* renamed from: c, reason: from getter */
        public final boolean getIgnoreCase() {
            return this.ignoreCase;
        }

        /* renamed from: d, reason: from getter */
        public final int getMinLength() {
            return this.minLength;
        }

        /* renamed from: e, reason: from getter */
        public final String getPrefix() {
            return this.prefix;
        }

        /* renamed from: f, reason: from getter */
        public final boolean getRemoveLeadingZeros() {
            return this.removeLeadingZeros;
        }

        /* renamed from: g, reason: from getter */
        public final String getSuffix() {
            return this.suffix;
        }

        /* renamed from: h, reason: from getter */
        public final boolean getIsDigitsOnly() {
            return this.isDigitsOnly;
        }

        /* renamed from: i, reason: from getter */
        public final boolean getIsDigitsOnlyAndNoPadding() {
            return this.isDigitsOnlyAndNoPadding;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("NumberHexFormat(");
            sb2.append('\n');
            b(sb2, "    ").append('\n');
            sb2.append(")");
            return sb2.toString();
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B\t\b\u0001¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lkotlin/text/HexFormat$Builder;", "", "<init>", "()V", "", "a", "Z", "getUpperCase", "()Z", "setUpperCase", "(Z)V", "upperCase", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private boolean upperCase = HexFormat.INSTANCE.a().getUpperCase();

        @PublishedApi
        public Builder() {
        }
    }

    static {
        BytesHexFormat.Companion companion = BytesHexFormat.INSTANCE;
        BytesHexFormat bytesHexFormatA = companion.a();
        NumberHexFormat.Companion companion2 = NumberHexFormat.INSTANCE;
        f148320e = new HexFormat(false, bytesHexFormatA, companion2.a());
        f148321f = new HexFormat(true, companion.a(), companion2.a());
    }

    public HexFormat(boolean z10, BytesHexFormat bytes, NumberHexFormat number) {
        Intrinsics.j(bytes, "bytes");
        Intrinsics.j(number, "number");
        this.upperCase = z10;
        this.bytes = bytes;
        this.number = number;
    }

    /* renamed from: b, reason: from getter */
    public final NumberHexFormat getNumber() {
        return this.number;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getUpperCase() {
        return this.upperCase;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("HexFormat(");
        sb2.append('\n');
        sb2.append("    upperCase = ");
        sb2.append(this.upperCase);
        sb2.append(",");
        sb2.append('\n');
        sb2.append("    bytes = BytesHexFormat(");
        sb2.append('\n');
        this.bytes.b(sb2, "        ").append('\n');
        sb2.append("    ),");
        sb2.append('\n');
        sb2.append("    number = NumberHexFormat(");
        sb2.append('\n');
        this.number.b(sb2, "        ").append('\n');
        sb2.append("    )");
        sb2.append('\n');
        sb2.append(")");
        return sb2.toString();
    }
}
