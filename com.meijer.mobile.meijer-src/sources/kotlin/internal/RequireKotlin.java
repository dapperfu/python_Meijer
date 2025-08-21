package kotlin.internal;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.annotation.Repeatable;
import kotlin.jvm.internal.RepeatableContainer;

/* JADX WARN: Method from annotation default annotation not found: errorCode */
/* JADX WARN: Method from annotation default annotation not found: level */
/* JADX WARN: Method from annotation default annotation not found: message */
/* JADX WARN: Method from annotation default annotation not found: versionKind */
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR})
@SinceKotlin
@kotlin.annotation.Target
@Retention(RetentionPolicy.SOURCE)
@kotlin.annotation.Retention
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0081\u0002\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lkotlin/internal/RequireKotlin;", "", "", "version", "message", "Lkotlin/DeprecationLevel;", "level", "Lkotlin/internal/RequireKotlinVersionKind;", "versionKind", "", "errorCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/DeprecationLevel;Lkotlin/internal/RequireKotlinVersionKind;I)V", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Repeatable
@java.lang.annotation.Repeatable(Container.class)
/* loaded from: classes10.dex */
public @interface RequireKotlin {

    @Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR})
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.annotation.Target
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention
    @RepeatableContainer
    public @interface Container {
    }
}
