package kotlin.reflect.jvm.internal.impl.types.error;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes14.dex */
public final class ErrorEntity {

    /* renamed from: b, reason: collision with root package name */
    public static final ErrorEntity f147767b = new ErrorEntity("ERROR_CLASS", 0, "<Error class: %s>");

    /* renamed from: c, reason: collision with root package name */
    public static final ErrorEntity f147768c = new ErrorEntity("ERROR_FUNCTION", 1, "<Error function>");

    /* renamed from: d, reason: collision with root package name */
    public static final ErrorEntity f147769d = new ErrorEntity("ERROR_SCOPE", 2, "<Error scope>");

    /* renamed from: e, reason: collision with root package name */
    public static final ErrorEntity f147770e = new ErrorEntity("ERROR_MODULE", 3, "<Error module>");

    /* renamed from: f, reason: collision with root package name */
    public static final ErrorEntity f147771f = new ErrorEntity("ERROR_PROPERTY", 4, "<Error property>");

    /* renamed from: g, reason: collision with root package name */
    public static final ErrorEntity f147772g = new ErrorEntity("ERROR_TYPE", 5, "[Error type: %s]");

    /* renamed from: h, reason: collision with root package name */
    public static final ErrorEntity f147773h = new ErrorEntity("PARENT_OF_ERROR_SCOPE", 6, "<Fake parent for error lexical scope>");

    /* renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ ErrorEntity[] f147774i;

    /* renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f147775j;

    /* renamed from: a, reason: collision with root package name */
    private final String f147776a;

    private static final /* synthetic */ ErrorEntity[] a() {
        return new ErrorEntity[]{f147767b, f147768c, f147769d, f147770e, f147771f, f147772g, f147773h};
    }

    static {
        ErrorEntity[] errorEntityArrA = a();
        f147774i = errorEntityArrA;
        f147775j = EnumEntriesKt.a(errorEntityArrA);
    }

    public static ErrorEntity valueOf(String str) {
        return (ErrorEntity) Enum.valueOf(ErrorEntity.class, str);
    }

    public static ErrorEntity[] values() {
        return (ErrorEntity[]) f147774i.clone();
    }

    public final String b() {
        return this.f147776a;
    }

    private ErrorEntity(String str, int i10, String str2) {
        this.f147776a = str2;
    }
}
