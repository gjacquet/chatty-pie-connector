/*
 * Copyright 2017 AppDirect, Inc. and/or its affiliates
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.chattypie.persistence.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QChatroomCreationRecord is a Querydsl query type for ChatroomCreationRecord
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QChatroomCreationRecord extends com.querydsl.sql.RelationalPathBase<ChatroomCreationRecord> {

    private static final long serialVersionUID = -2128957277;

    public static final QChatroomCreationRecord chatroomCreationRecord = new QChatroomCreationRecord("chatroom_creation_record");

    public final DateTimePath<java.time.Instant> creationDate = createDateTime("creationDate", java.time.Instant.class);

    public final StringPath id = createString("id");

    public final com.querydsl.sql.PrimaryKey<ChatroomCreationRecord> primary = createPrimaryKey(id);

    public QChatroomCreationRecord(String variable) {
        super(ChatroomCreationRecord.class, forVariable(variable), "null", "chatroom_creation_record");
        addMetadata();
    }

    public QChatroomCreationRecord(String variable, String schema, String table) {
        super(ChatroomCreationRecord.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QChatroomCreationRecord(String variable, String schema) {
        super(ChatroomCreationRecord.class, forVariable(variable), schema, "chatroom_creation_record");
        addMetadata();
    }

    public QChatroomCreationRecord(Path<? extends ChatroomCreationRecord> path) {
        super(path.getType(), path.getMetadata(), "null", "chatroom_creation_record");
        addMetadata();
    }

    public QChatroomCreationRecord(PathMetadata metadata) {
        super(ChatroomCreationRecord.class, metadata, "null", "chatroom_creation_record");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(creationDate, ColumnMetadata.named("creation_date").withIndex(2).ofType(Types.TIMESTAMP).withSize(19));
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.VARCHAR).withSize(255).notNull());
    }

}

