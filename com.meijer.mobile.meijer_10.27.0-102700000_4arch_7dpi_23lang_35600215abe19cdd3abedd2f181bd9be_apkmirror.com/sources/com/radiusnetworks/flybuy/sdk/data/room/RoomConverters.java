package com.radiusnetworks.flybuy.sdk.data.room;

import com.google.gson.Gson;
import com.radiusnetworks.flybuy.sdk.data.common.InputType;
import com.radiusnetworks.flybuy.sdk.data.common.InputTypeKt;
import com.radiusnetworks.flybuy.sdk.data.pickup_config.PickupConfig;
import j$.time.Instant;
import j$.time.OffsetDateTime;
import j$.time.format.DateTimeFormatter;
import java.util.UUID;
import jj.r;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\b\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\n\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u000f\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0015\u001a\u0004\u0018\u00010\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0011H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0018\u001a\u00020\u00172\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001e\u001a\u00020\u001d2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010!\u001a\u00020\u00042\b\u0010 \u001a\u0004\u0018\u00010\u001dH\u0007¢\u0006\u0004\b!\u0010\"R\u001c\u0010%\u001a\n $*\u0004\u0018\u00010#0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/data/room/RoomConverters;", "", "<init>", "()V", "", "value", "j$/time/Instant", "toInstant", "(Ljava/lang/String;)Lj$/time/Instant;", "date", "fromInstant", "(Lj$/time/Instant;)Ljava/lang/String;", "j$/time/OffsetDateTime", "toOffsetDateTime", "(Ljava/lang/String;)Lj$/time/OffsetDateTime;", "fromOffsetDateTime", "(Lj$/time/OffsetDateTime;)Ljava/lang/String;", "Ljava/util/UUID;", "fromString", "(Ljava/lang/String;)Ljava/util/UUID;", "uuid", "uuidToString", "(Ljava/util/UUID;)Ljava/lang/String;", "Lcom/radiusnetworks/flybuy/sdk/data/common/InputType;", "toInputType", "(Ljava/lang/String;)Lcom/radiusnetworks/flybuy/sdk/data/common/InputType;", "inputType", "fromInputType", "(Lcom/radiusnetworks/flybuy/sdk/data/common/InputType;)Ljava/lang/String;", "Lcom/radiusnetworks/flybuy/sdk/data/pickup_config/PickupConfig;", "toPickupConfig", "(Ljava/lang/String;)Lcom/radiusnetworks/flybuy/sdk/data/pickup_config/PickupConfig;", "pickupConfig", "fromPickupConfig", "(Lcom/radiusnetworks/flybuy/sdk/data/pickup_config/PickupConfig;)Ljava/lang/String;", "j$/time/format/DateTimeFormatter", "kotlin.jvm.PlatformType", "formatterOffsetDateTime", "Lj$/time/format/DateTimeFormatter;", "core_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class RoomConverters {
    private final DateTimeFormatter formatterOffsetDateTime = DateTimeFormatter.ISO_OFFSET_DATE_TIME;

    public final String fromInputType(InputType inputType) {
        Intrinsics.j(inputType, "inputType");
        return inputType.getAsString();
    }

    public final String fromInstant(Instant date) {
        if (date != null) {
            return date.toString();
        }
        return null;
    }

    public final String fromOffsetDateTime(OffsetDateTime date) {
        if (date != null) {
            return date.format(this.formatterOffsetDateTime);
        }
        return null;
    }

    public final String fromPickupConfig(PickupConfig pickupConfig) {
        String strX = new Gson().x(pickupConfig);
        Intrinsics.i(strX, "toJson(...)");
        return strX;
    }

    public final Instant toInstant(String value) {
        if (value != null) {
            return Instant.parse(value);
        }
        return null;
    }

    public final OffsetDateTime toOffsetDateTime(String value) {
        if (value != null) {
            return (OffsetDateTime) this.formatterOffsetDateTime.parse(value, new r());
        }
        return null;
    }

    public final PickupConfig toPickupConfig(String value) {
        try {
            Object objO = new Gson().o(value, PickupConfig.class);
            Intrinsics.g(objO);
            return (PickupConfig) objO;
        } catch (Exception unused) {
            return PickupConfig.INSTANCE.getDEFAULT_PICKUP_CONFIG();
        }
    }

    public final String uuidToString(UUID uuid) {
        if (uuid != null) {
            return uuid.toString();
        }
        return null;
    }

    public final UUID fromString(String value) {
        return UUID.fromString(value);
    }

    public final InputType toInputType(String value) {
        return InputTypeKt.toInputType(value);
    }
}
