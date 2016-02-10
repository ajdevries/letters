databaseChangeLog = {

    changeSet(author: "Albert-Jan de Vries", id: "1") {
        createTable(tableName: "game") {
            column(autoIncrement: "true", name: "id", type: "BIGINT") {
                constraints(primaryKey: "true", primaryKeyName: "gamePK")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "date_created", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "good", type: "INT") {
                constraints(nullable: "false")
            }

            column(name: "last_updated", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "level", type: "INT") {
                constraints(nullable: "false")
            }
        }
    }

}
