/** 
 *  Generated by OpenJPA MetaModel Generator Tool.
**/

package org.apache.openmeetings.persistence.beans.logs;

import java.lang.Long;
import java.lang.String;
import java.util.Date;
import javax.persistence.metamodel.SingularAttribute;

@javax.persistence.metamodel.StaticMetamodel
(value=org.apache.openmeetings.persistence.beans.logs.ConferenceLogType.class)
@javax.annotation.Generated
(value="org.apache.openjpa.persistence.meta.AnnotationProcessor6",date="Wed Mar 06 22:04:00 CST 2013")
public class ConferenceLogType_ {
    public static volatile SingularAttribute<ConferenceLogType,Long> conferenceLogTypeId;
    public static volatile SingularAttribute<ConferenceLogType,String> eventType;
    public static volatile SingularAttribute<ConferenceLogType,Date> inserted;
    public static volatile SingularAttribute<ConferenceLogType,Long> insertedby;
}
