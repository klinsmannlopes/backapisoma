## Teste Prático Back-end Pleno O POVO

### Informações para subir aplicação

#### Requisitos

Possuir java 11 e o banco de dados postgreSQL

## Criar database com o nome **api-rest-soma** com os acessos

- **USERNAME:** postgres
- **PASSWORD:** admin

*OBS: pra mais informações de banco olhar arquivo __aplication.properties__ da aplicação spring*


## Executar comandos sql abaixo para realizar testes.

**Sql para tabela funcionario**

```
	INSERT INTO public.funcionario(id, funcao, matricula, nome)
    VALUES (1, 'Analista', 1001, 'Luiz Dalcico');

	INSERT INTO public.funcionario(id, funcao, matricula, nome)
    VALUES (2, 'Administrativo', 1002, 'Funcionário Fulano');

	INSERT INTO public.funcionario(id, funcao, matricula, nome)
    VALUES (3, 'Financeiro', 1003, 'Funcionário Cicrano');


```

**Sql para tabela extrato**

```
	INSERT INTO public.extrato( id, data, operacacao, valor)
    VALUES (1 ,to_date('23/11/2019','DD/MM/YYYY') , 'Saque ATM', -450);

	INSERT INTO public.extrato(id, data, operacacao, valor)
    VALUES (2 ,to_date('24/11/2019','DD/MM/YYYY') , 'Saque ATM', -450);

	INSERT INTO public.extrato(id, data, operacacao, valor)
    VALUES (3 ,to_date('25/11/2019','DD/MM/YYYY') , 'Saque ATM', -450);

	INSERT INTO public.extrato(id, data, operacacao, valor)
    VALUES (4 ,to_date('26/11/2019','DD/MM/YYYY') , 'Pagamento de folha', -50200.00);

	INSERT INTO public.extrato(id, data, operacacao, valor)
    VALUES (5 ,to_date('26/11/2019','DD/MM/YYYY') , 'Vendas TEF', 100700.00);

```

#### Entidades

- **Funcionario**
	- Id - Primary Key
	- Função
	- Matricula
	- Nome

-	**Extrato**
	-	Id - Primary Key
	-	Data
	-	Tipo Operação
	-	Valor Operação

#### Rotas:

- **Back Soma**
	- **GET backapisoma/api/funcionario** (rota para criação de novos jornalistas)
	- **POST backapisoma/api/extrato** (rota para autenticação jornalistas)
	- **POST backapisoma/api/saldo** (rota que retorna os dados do jornalista, a senha deverá estar oculta. Essa rota necessita de autenticação)
