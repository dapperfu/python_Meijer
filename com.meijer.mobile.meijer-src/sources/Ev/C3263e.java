package Ev;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\u000f\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0013\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR\"\u0010\u0016\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0015\u0010\f\"\u0004\b\u0014\u0010\u000eR\"\u0010\u0018\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\n\u001a\u0004\b\u0018\u0010\f\"\u0004\b\u0019\u0010\u000eR\"\u0010\u001d\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\n\u001a\u0004\b\u001b\u0010\f\"\u0004\b\u001c\u0010\u000eR(\u0010'\u001a\u00020\u001e8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u001f\u0010 \u0012\u0004\b%\u0010&\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010+\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010\n\u001a\u0004\b)\u0010\f\"\u0004\b*\u0010\u000eR\"\u0010/\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010 \u001a\u0004\b-\u0010\"\"\u0004\b.\u0010$R(\u00108\u001a\u0002008\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b1\u00102\u0012\u0004\b7\u0010&\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u0010<\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010\n\u001a\u0004\b:\u0010\f\"\u0004\b;\u0010\u000eR(\u0010A\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b=\u0010\n\u0012\u0004\b@\u0010&\u001a\u0004\b>\u0010\f\"\u0004\b?\u0010\u000eR(\u0010F\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bB\u0010\n\u0012\u0004\bE\u0010&\u001a\u0004\bC\u0010\f\"\u0004\bD\u0010\u000eR(\u0010K\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bG\u0010\n\u0012\u0004\bJ\u0010&\u001a\u0004\bH\u0010\f\"\u0004\bI\u0010\u000eR\"\u0010O\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bL\u0010\n\u001a\u0004\bM\u0010\f\"\u0004\bN\u0010\u000eR\"\u0010S\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bP\u0010\n\u001a\u0004\bQ\u0010\f\"\u0004\bR\u0010\u000eR\"\u0010W\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bT\u0010\n\u001a\u0004\bU\u0010\f\"\u0004\bV\u0010\u000eR\"\u0010^\u001a\u00020X8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b\u0010\u0010[\"\u0004\b\\\u0010]¨\u0006_"}, d2 = {"LEv/e;", "", "LEv/b;", "json", "<init>", "(LEv/b;)V", "LEv/g;", "a", "()LEv/g;", "", "Z", "getEncodeDefaults", "()Z", "setEncodeDefaults", "(Z)V", "encodeDefaults", "b", "getExplicitNulls", "setExplicitNulls", "explicitNulls", "c", "getIgnoreUnknownKeys", "ignoreUnknownKeys", "d", "isLenient", "setLenient", "e", "getPrettyPrint", "setPrettyPrint", "prettyPrint", "", "f", "Ljava/lang/String;", "getPrettyPrintIndent", "()Ljava/lang/String;", "setPrettyPrintIndent", "(Ljava/lang/String;)V", "getPrettyPrintIndent$annotations", "()V", "prettyPrintIndent", "g", "getCoerceInputValues", "setCoerceInputValues", "coerceInputValues", "h", "getClassDiscriminator", "setClassDiscriminator", "classDiscriminator", "LEv/a;", "i", "LEv/a;", "getClassDiscriminatorMode", "()LEv/a;", "setClassDiscriminatorMode", "(LEv/a;)V", "getClassDiscriminatorMode$annotations", "classDiscriminatorMode", "j", "getUseAlternativeNames", "setUseAlternativeNames", "useAlternativeNames", "k", "getDecodeEnumsCaseInsensitive", "setDecodeEnumsCaseInsensitive", "getDecodeEnumsCaseInsensitive$annotations", "decodeEnumsCaseInsensitive", "l", "getAllowTrailingComma", "setAllowTrailingComma", "getAllowTrailingComma$annotations", "allowTrailingComma", "m", "getAllowComments", "setAllowComments", "getAllowComments$annotations", "allowComments", "n", "getAllowSpecialFloatingPointValues", "setAllowSpecialFloatingPointValues", "allowSpecialFloatingPointValues", "o", "getAllowStructuredMapKeys", "setAllowStructuredMapKeys", "allowStructuredMapKeys", "p", "getUseArrayPolymorphism", "setUseArrayPolymorphism", "useArrayPolymorphism", "LIv/c;", "q", "LIv/c;", "()LIv/c;", "setSerializersModule", "(LIv/c;)V", "serializersModule", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: Ev.e, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C3263e {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private boolean encodeDefaults;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean explicitNulls;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean ignoreUnknownKeys;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean isLenient;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean prettyPrint;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private String prettyPrintIndent;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean coerceInputValues;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private String classDiscriminator;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private EnumC3259a classDiscriminatorMode;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private boolean useAlternativeNames;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private boolean decodeEnumsCaseInsensitive;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private boolean allowTrailingComma;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private boolean allowComments;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private boolean allowSpecialFloatingPointValues;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private boolean allowStructuredMapKeys;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private boolean useArrayPolymorphism;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private Iv.c serializersModule;

    public C3263e(AbstractC3260b json) {
        Intrinsics.j(json, "json");
        this.encodeDefaults = json.getConfiguration().getEncodeDefaults();
        this.explicitNulls = json.getConfiguration().getExplicitNulls();
        this.ignoreUnknownKeys = json.getConfiguration().getIgnoreUnknownKeys();
        this.isLenient = json.getConfiguration().getIsLenient();
        this.prettyPrint = json.getConfiguration().getPrettyPrint();
        this.prettyPrintIndent = json.getConfiguration().getPrettyPrintIndent();
        this.coerceInputValues = json.getConfiguration().getCoerceInputValues();
        this.classDiscriminator = json.getConfiguration().getClassDiscriminator();
        this.classDiscriminatorMode = json.getConfiguration().getClassDiscriminatorMode();
        this.useAlternativeNames = json.getConfiguration().getUseAlternativeNames();
        json.getConfiguration().l();
        this.decodeEnumsCaseInsensitive = json.getConfiguration().getDecodeEnumsCaseInsensitive();
        this.allowTrailingComma = json.getConfiguration().getAllowTrailingComma();
        this.allowComments = json.getConfiguration().getAllowComments();
        this.allowSpecialFloatingPointValues = json.getConfiguration().getAllowSpecialFloatingPointValues();
        this.allowStructuredMapKeys = json.getConfiguration().getAllowStructuredMapKeys();
        this.useArrayPolymorphism = json.getConfiguration().getUseArrayPolymorphism();
        this.serializersModule = json.getSerializersModule();
    }

    public final JsonConfiguration a() {
        if (this.useArrayPolymorphism) {
            if (!Intrinsics.e(this.classDiscriminator, "type")) {
                throw new IllegalArgumentException("Class discriminator should not be specified when array polymorphism is specified");
            }
            if (this.classDiscriminatorMode != EnumC3259a.f8596c) {
                throw new IllegalArgumentException("useArrayPolymorphism option can only be used if classDiscriminatorMode in a default POLYMORPHIC state.");
            }
        }
        if (this.prettyPrint) {
            if (!Intrinsics.e(this.prettyPrintIndent, "    ")) {
                String str = this.prettyPrintIndent;
                for (int i10 = 0; i10 < str.length(); i10++) {
                    char cCharAt = str.charAt(i10);
                    if (cCharAt != ' ' && cCharAt != '\t' && cCharAt != '\r' && cCharAt != '\n') {
                        throw new IllegalArgumentException(("Only whitespace, tab, newline and carriage return are allowed as pretty print symbols. Had " + this.prettyPrintIndent).toString());
                    }
                }
            }
        } else if (!Intrinsics.e(this.prettyPrintIndent, "    ")) {
            throw new IllegalArgumentException("Indent should not be specified when default printing mode is used");
        }
        return new JsonConfiguration(this.encodeDefaults, this.ignoreUnknownKeys, this.isLenient, this.allowStructuredMapKeys, this.prettyPrint, this.explicitNulls, this.prettyPrintIndent, this.coerceInputValues, this.useArrayPolymorphism, this.classDiscriminator, this.allowSpecialFloatingPointValues, this.useAlternativeNames, null, this.decodeEnumsCaseInsensitive, this.allowTrailingComma, this.allowComments, this.classDiscriminatorMode);
    }

    /* renamed from: b, reason: from getter */
    public final Iv.c getSerializersModule() {
        return this.serializersModule;
    }

    public final void c(boolean z10) {
        this.ignoreUnknownKeys = z10;
    }
}
