package Fv;

import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.serialization.json.internal.JsonDecodingException;
import kotlinx.serialization.json.internal.JsonEncodingException;

@Metadata(d1 = {"\u0000B\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u0004\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\t\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001b\u0010\u0014\u001a\u00020\u0013*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001d\u0010\u0017\u001a\u00020\u0013*\u00020\u00112\b\b\u0002\u0010\u0016\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0017\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u0019H\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a'\u0010\u001e\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a'\u0010 \u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b \u0010!\u001a\u001f\u0010\"\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\"\u0010#\u001a\u001d\u0010$\u001a\u00020\u0007*\u00020\u00072\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b$\u0010%¨\u0006&"}, d2 = {"", "offset", "", "message", "Lkotlinx/serialization/json/internal/JsonDecodingException;", "d", "(ILjava/lang/String;)Lkotlinx/serialization/json/internal/JsonDecodingException;", "", "input", "e", "(ILjava/lang/String;Ljava/lang/CharSequence;)Lkotlinx/serialization/json/internal/JsonDecodingException;", "", "value", "output", "Lkotlinx/serialization/json/internal/JsonEncodingException;", "b", "(Ljava/lang/Number;Ljava/lang/String;)Lkotlinx/serialization/json/internal/JsonEncodingException;", "LFv/a;", "result", "", "k", "(LFv/a;Ljava/lang/Number;)Ljava/lang/Void;", "entity", "g", "(LFv/a;Ljava/lang/String;)Ljava/lang/Void;", "LBv/f;", "keyDescriptor", "c", "(LBv/f;)Lkotlinx/serialization/json/internal/JsonEncodingException;", "key", "a", "(Ljava/lang/Number;Ljava/lang/String;Ljava/lang/String;)Lkotlinx/serialization/json/internal/JsonDecodingException;", "l", "(Ljava/lang/Number;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "f", "(Ljava/lang/String;Ljava/lang/String;)Lkotlinx/serialization/json/internal/JsonDecodingException;", "i", "(Ljava/lang/CharSequence;I)Ljava/lang/CharSequence;", "kotlinx-serialization-json"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class A {
    public static final JsonDecodingException a(Number value, String key, String output) {
        Intrinsics.j(value, "value");
        Intrinsics.j(key, "key");
        Intrinsics.j(output, "output");
        return d(-1, l(value, key, output));
    }

    public static final JsonEncodingException b(Number value, String output) {
        Intrinsics.j(value, "value");
        Intrinsics.j(output, "output");
        return new JsonEncodingException("Unexpected special floating-point value " + value + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) j(output, 0, 1, null)));
    }

    public static final JsonEncodingException c(Bv.f keyDescriptor) {
        Intrinsics.j(keyDescriptor, "keyDescriptor");
        return new JsonEncodingException("Value of type '" + keyDescriptor.getSerialName() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + keyDescriptor.getKind() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }

    public static final JsonDecodingException d(int i10, String message) {
        Intrinsics.j(message, "message");
        if (i10 >= 0) {
            message = "Unexpected JSON token at offset " + i10 + ": " + message;
        }
        return new JsonDecodingException(message);
    }

    public static final JsonDecodingException e(int i10, String message, CharSequence input) {
        Intrinsics.j(message, "message");
        Intrinsics.j(input, "input");
        return d(i10, message + "\nJSON input: " + ((Object) i(input, i10)));
    }

    public static final JsonDecodingException f(String key, String input) {
        Intrinsics.j(key, "key");
        Intrinsics.j(input, "input");
        return d(-1, "Encountered an unknown key '" + key + "'.\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.\nCurrent input: " + ((Object) j(input, 0, 1, null)));
    }

    public static final Void g(JsonReader jsonReader, String entity) {
        Intrinsics.j(jsonReader, "<this>");
        Intrinsics.j(entity, "entity");
        jsonReader.w("Trailing comma before the end of JSON " + entity, jsonReader.currentPosition - 1, "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingCommas = true' in 'Json {}' builder to support them.");
        throw new KotlinNothingValueException();
    }

    public static /* synthetic */ Void h(JsonReader jsonReader, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "object";
        }
        return g(jsonReader, str);
    }

    public static final CharSequence i(CharSequence charSequence, int i10) {
        Intrinsics.j(charSequence, "<this>");
        if (charSequence.length() >= 200) {
            if (i10 != -1) {
                int i11 = i10 - 30;
                int i12 = i10 + 30;
                return (i11 <= 0 ? "" : ".....") + charSequence.subSequence(RangesKt.f(i11, 0), RangesKt.k(i12, charSequence.length())).toString() + (i12 >= charSequence.length() ? "" : ".....");
            }
            int length = charSequence.length() - 60;
            if (length > 0) {
                return "....." + charSequence.subSequence(length, charSequence.length()).toString();
            }
        }
        return charSequence;
    }

    public static /* synthetic */ CharSequence j(CharSequence charSequence, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = -1;
        }
        return i(charSequence, i10);
    }

    public static final Void k(JsonReader jsonReader, Number result) {
        Intrinsics.j(jsonReader, "<this>");
        Intrinsics.j(result, "result");
        JsonReader.x(jsonReader, "Unexpected special floating-point value " + result + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2, null);
        throw new KotlinNothingValueException();
    }

    private static final String l(Number number, String str, String str2) {
        return "Unexpected special floating-point value " + number + " with key " + str + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) j(str2, 0, 1, null));
    }
}
